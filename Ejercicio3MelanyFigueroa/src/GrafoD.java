
import java.util.ArrayList;
import java.util.LinkedList;



public class GrafoD extends Grafo{
	
	protected int numV, numA;
	protected ArrayList<LinkedList<Adyacente>> arr;
	public enum Color{BLANCO,GRIS,NEGRO};
	private ArrayList<Color> visitado;

	public GrafoD(int numVertices){
		visitado = new ArrayList<Color>(numVertices);
		numV = numVertices;
		numA = 0;
		arr = new ArrayList<LinkedList<Adyacente>>(numVertices);
		for(int i = 0; i < numVertices; i++){
			arr.add(new LinkedList<Adyacente>());
		}
	}


	public int numAristas() {
		return numA;
	}
	
	public int numVertices() {
		return numV;
	}


	public boolean existeArista(int i, int j) {
		if(arr.get(i)==null){
			return false;
		}
		else{
			LinkedList<Adyacente> lista = arr.get(i);
			boolean esta = false;
			for (Adyacente adyacente : lista) {
				if(adyacente.destino == j){
					esta = true;
				}
			}
			return esta;
		}
	}

	public double pesoArista(int i, int j) {
		LinkedList<Adyacente> lista = arr.get(i);
		double peso = 0.0;
		for (Adyacente adyacente : lista) {
			if(adyacente.destino == j){
				peso = adyacente.peso;
			}
		}
		return peso;
	}

	public void insertarArista(int i, int j) {
		insertarArista(i,j,0);
	}


	public void insertarArista(int i, int j, double p) {
		if(!existeArista(i,j)){
			arr.get(i).add(new Adyacente(j,p));
			numA++;
		}
	}

	public LinkedList<Adyacente> adyacentesDe(int i) {
		return arr.get(i);
	}

	public String imprimirAdyacentes(int i){
		LinkedList<Adyacente> lista = arr.get(i);
		String s = "";
		for (Adyacente adyacente : lista) {
			s+= adyacente.toString()+" ";
		}
		return s;
	}

	private void DFSrecursivo(int u){
		//Recorre el grafo en busca de ciclos de manera recursiva
		visitado.set(u,Color.GRIS);
		LinkedList<Adyacente> a = arr.get(u);
		
		for (Adyacente adyacente : a) {
			if(visitado.get(adyacente.destino)==Color.BLANCO){
				DFSrecursivo(adyacente.destino);
			}
			else if(visitado.get(adyacente.destino)==Color.GRIS){
				System.out.print("Hay ciclo");

			}
			visitado.set(u, Color.NEGRO);
		}

	}

	private void DFSiterativo(int u){
	//Recorre el grafo en busca de ciclos de manera iterativa
		visitado.set(u,Color.GRIS);
		LinkedList<Adyacente> a = arr.get(u);

		for (Adyacente adyacente : a) {
			if ((visitado.get(adyacente.destino)==Color.BLANCO)){
				u++;
				a=arr.get(u);
			}
			else if(visitado.get(adyacente.destino)==Color.GRIS){
				System.out.print("Hay ciclo");

			}
				 visitado.set(u, Color.NEGRO);
		}

	}


	public void DFS_Forest() {
		for(int i=0;i<numV;i++){
			visitado.add(Color.BLANCO);
		}
		for(int j=0;j<numV;j++){
			if(visitado.get(j)==Color.BLANCO){
				DFSrecursivo(j);
			}
		}
		visitado.clear();
	}


}
