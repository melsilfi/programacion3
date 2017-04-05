public class MySimpleLinkedList {

	protected Node first;



public MySimpleLinkedList() {

	first = null;

}

public void insert(Node no) {
	//Este metodo agrega los nodos a la pila, Apilar

	Node tmp = new Node(no.getInfo(), no);

	tmp.setNext(first);

	first = tmp;

}

public Node extract(Node aux) { 
//Este metodo devuelve la tapa de la pila a eliminar
	if (istop(aux)){
		System.out.println("Elimino la tapa:"+ aux.getInfo()+aux.getNext());
		return aux;
	}
	System.out.println("No es la tapa de la pila");
	return null;
}



public boolean isEmpty(Node aux) { 
	//Este método dice si la pila no esta vacia
	if (aux==null){
		System.out.println("La pila esta vacia");
		return true;
	}
	else {
		System.out.println("La pila contiene elementos");
		return false;
	}
}


public int gettop (Node aux) {
	//Este método devuelve el valor de la tapa de la pila.
	
	if (istop(aux)){
		System.out.println("La tapa de la pila es:"+ aux.getInfo());
		return aux.getInfo();
	}
	else{
		gettop(aux.getNext());
}
	return 0;
}

public boolean istop (Node aux) {
	//Este metodo retorna true si es el tope de la pila
return (aux.getNext()==null);
}
}