public class Order {

	private int [] arr;
	
	public Order(int [] aux){
    arr=aux;
	}
	
	
	
	public void burbujeo(){
		int aux;
		int t = arr.length;
		

		for (int i = 1; i < t; i++){
			for (int j = t- 1; j >= i; j--){
				if(arr[j] < arr[j-1])
				{
					aux = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=  aux;
				}
			}
		}
		System.out.println("Arreglo ordenado por Burbujeo:");
		for (int pos1 = 0; pos1< arr.length ; pos1++) {
		System.out.println(arr[pos1]);
	}

}
	
	public void swap(int i, int j){
		int aux=arr[i];
		arr[i]=arr[j];
		arr[j]=aux;
	}
	
	public void quickSort(int izq, int der) {

		  int pivote=arr[izq];
		  int i=izq; 
		  int j=der; 
		  int aux;
		 
		  while(i<j){          
		     while(arr[i]<=pivote && i<j)
		    	 i++; 
		     
		     while(arr[j]>pivote) j--;       
			     if (i<j) {                                        
			         aux= arr[i];             
			         arr[i]=arr[j];
			         arr[j]=aux;
			     }
		  }
		  arr[izq]=arr[j]; 
		  arr[j]=pivote; 
		   if(izq<j-1)
		      quickSort(izq,j-1);
		   if(j+1 <der)
		      quickSort(j+1,der);
		   
			System.out.println("Arreglo ordenado por QuickSort:");
			for (int pos1 = 0; pos1< arr.length ; pos1++) {
			System.out.println(arr[pos1]);
		}
}
	
}



