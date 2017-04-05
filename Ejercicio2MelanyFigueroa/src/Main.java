
public class Main {

	public static void main(String[] args) {

		int[] aux={3,8,7,2,5,4,9};
		System.out.println("Arreglo Original:"+" 3 8 7 2 5 4 9");
		
		Order o1= new Order(aux);
		long tiempoIniciobu=System.currentTimeMillis();
		o1.burbujeo();
		long tiempoFinalbu=System.currentTimeMillis();
		long tiempoTotalbu=tiempoFinalbu-tiempoIniciobu;
		System.out.println("Tiempo de ejecucion Busbujeo "+tiempoTotalbu+" milisegundos");
		long tiempoInicioqs=System.currentTimeMillis();
		o1.quickSort(0,1);
		long tiempoFinalqs=System.currentTimeMillis();
		long tiempoTotalqs=tiempoFinalqs-tiempoIniciobu;
		System.out.println("Tiempo de ejecucion QuickSort "+tiempoTotalbu+" milisegundos");


	}
 


}
