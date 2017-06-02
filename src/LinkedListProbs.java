import java.util.HashSet;

public class LinkedListProbs {

	
	public static void main(String args[]){
		
		MyLinkedList ll = new MyLinkedList();
		
		Node a1 = new Node(3);
		Node a2 = new Node (4);
		Node a3 = new Node (3);
		Node a4 = new Node (6);
		
		ll.addNode(a1);
		ll.addNode(a2);
		ll.addNode(a3);
		ll.addNode(a4);
		
		ll.printNodes();
		
		//removeDupFromUSlist(ll.head);
		
		removeDup(ll.head);
		
		ll.printNodes();
	}
	
	
	
	public static void removeDupFromUSlist(Node n){
		
		Node head = n;
	 
		if(n == null || n.next==null)
	  	    return;
	 
		while(n.next != null){
		    Node twoPointer = head;
		while(twoPointer.next != null){
	    if(n.data == twoPointer.next.data)
	    	 twoPointer.setNext(twoPointer.next.next);
	    else
	       twoPointer = twoPointer.next; 
	}
	       n = n.next;
	 
	}
	 
	}
	
	
		public static void removeDup(Node n){
		 
		//Node head = n;
			
		if(n == null || n.next == null)
			return;
		 
		HashSet<Integer> hs = new HashSet<Integer>();
		 
		while(n !=null){
		hs.add(n.data);
		if(!hs.contains(n.next.data)){
			System.out.println("coming in if");
			hs.add(n.next.data);
		}
		else
		{ //remove the node from the list
			System.out.println("am coming in");
			n.setNext(n.next.next); 
		}
		 
		n = n.next;
		}
		return;
		}

	
}
