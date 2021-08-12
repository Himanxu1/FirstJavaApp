package list;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("banana");
		System.out.println(fruits);
		
		Pair<String , Integer> p1 = new Pair("max", 230);
		Pair<Boolean , String> p2 = new Pair(true, "maxd");
		p1.getDescription();
		p2.getDescription();

	}

}
