package MyOueue;

public class Main {

	public static void main(String[] args) {
		
		
		MyQueue<Integer> q = new MyQueue<>();
		q.enqueue(12);
		q.enqueue(21);
		q.enqueue(2);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	
		
	}

}
