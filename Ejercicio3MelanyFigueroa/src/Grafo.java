
import java.util.LinkedList;


public abstract class Grafo {

	public Grafo(){
		
	};

	public abstract int numVertices();
	public abstract int numAristas();
	public abstract boolean existeArista(int i, int j);
	public abstract double pesoArista(int i, int j);
	public abstract void insertarArista(int i, int j);
	public abstract void insertarArista(int i, int j, double p);
	public abstract LinkedList<Adyacente> adyacentesDe(int i);
	public abstract void DFS_Forest();

	public String toString(){
		String res = "" ;
		for (int i = 0 ; i < numVertices() ; i++) {
			res += "Vertice: " + i;
			LinkedList<Adyacente> lista = adyacentesDe(i);
			res += (lista.isEmpty()) ? " no tiene adyacentes " : " tiene adyacentes: ";
			for (int i1 = 0; i1 < lista.size();i1++)
				res += lista.get(i1) + " ";
			res += "\n";
		} return res;
	}

}
