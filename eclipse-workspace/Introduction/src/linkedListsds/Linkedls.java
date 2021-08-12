package linkedListsds;

public class Linkedls {

	Node1 head;
	
	public void insert(int data) {
		
		Node1 node = new Node1();
		node.data = data;
		node.next = null;
		
		
		if(head == null) {
			head = node;
			
		}else {
			Node1 n = head;
			while(n.next != null) {
				n = n.next;	
			}
			n.next = node;
			
		}
		
		
	}
	
	public void show() {
		Node1 node = head;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		
	}
	
}
