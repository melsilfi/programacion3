public class Main {

	public static void main(String[] args) {
		//Para cambiar el modo de busqueda :iterativa,recursiva
		//hay que cambiar la función en el DFS-Forest 
		
		int cantNodos=1000;

		GrafoD g = new GrafoD(cantNodos);
		//Grafo de mil nodos
		for (int i=0; i<cantNodos;i++){
			int nodo = (int) (Math.random()*50)+1;
			int adyacente = (int) (Math.random()*50)+1;
			g.insertarArista(nodo, adyacente);
		}
		//Grafo mas chico de prueba
		
		GrafoD g2 = new GrafoD(6);
		for (int i=0; i<=6;i++){
			int nodo = (int) (Math.random()*5)+1;
			int adyacente = (int) (Math.random()*5)+1;
			g2.insertarArista(nodo, adyacente);
		}
		System.out.println("Grafo de prueba:");
		System.out.println(g2.toString());
		System.out.println(g2.imprimirAdyacentes(0));
		System.out.println();

		g2.DFS_Forest();
		System.out.println();
		System.out.println();
		System.out.println("Grafo de mil Nodos:");
		System.out.println(g.toString());
		System.out.println(g.imprimirAdyacentes(0));

		
		System.out.println();
		g.DFS_Forest();
		System.out.println();

	}

}
