
public class MyLinkedList {

	Node head = null; 
	
	
	
	public void addNode(Node node){
		if(this.head == null)
			head = node;
		else{
			Node n = head;
			while(n.next!=null){
			n = n.next;
			}
			n.setNext(node);
		}
	
	}
	
	
	public void printNodes(){
		Node n = head;
		
		do{
			System.out.println(n.data);
			n = n.next;
		}while(n!=null);
		
	}
	}
