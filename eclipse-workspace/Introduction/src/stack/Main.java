package stack;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Mystack<Integer> stack = new Mystack();
		
		stack.push(12);
		stack.push(21);
		stack.push(32);
		
		int popped = stack.pop();
		System.out.println(popped);
		int peeked = stack.peek();
		System.out.println(peeked);
	
		

	}

}
