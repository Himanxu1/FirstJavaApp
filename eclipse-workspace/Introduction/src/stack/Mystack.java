package stack;

import apnikaksha.MyLinkedList;

public class Mystack<E> {

	private MyLinkedList<E> li = new MyLinkedList<>();
	
	
	
	void push(E e) {
		li.add(e);
	}
	
	E pop() throws Exception{
		if(li.isEmpty()) {
			throw new Exception("popping from empty list");
			
		}
		return li.removeLast();
		
	}
	
	E peek() throws Exception{
		if(li.isEmpty()) {
			throw new Exception("Peek from empty list");
		}
		return li.getLast();
	}
	
}
