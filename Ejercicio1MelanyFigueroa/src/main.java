
public class main {

	public static void main(String[] args) {
		
		Node n0=new Node(6,null);
		Node n1= new Node(2,n0);
		Node n2= new Node(3,n1);
		Node n3= new Node(5,n2);
		Node n4= new Node(8,n3);
		Node n5= new Node(3,n4);
		
		MySimpleLinkedList lista= new MySimpleLinkedList();
		lista.insert(n0);
		lista.insert(n1);
		lista.insert(n2);
		lista.insert(n3);
		lista.insert(n4);
		lista.insert(n5);
		
		lista.isEmpty(n0);
		lista.gettop(n3);
		lista.extract(n0);
		lista.extract(n5);
		

	}

}
