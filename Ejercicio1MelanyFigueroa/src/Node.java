public class Node {

	private int number;
	private Node next;
	

public Node() {
	
	number=0;
	next = null;

	}

public Node(int i, Node n) {
	
	setInfo(i);
	setNext(n);
	}

public void setInfo(int i) {
	number = i;
	}
	
public void setNext(Node n) {
	next = n;
	}

public int getInfo() {
	return number;
	}

public Node getNext() {
	return next;

	}

}