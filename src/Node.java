
public class Node {

	int data; 
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	Node next = null; 
	
	public Node (int value){
		this.data = value;
	}
	
	
	
}
