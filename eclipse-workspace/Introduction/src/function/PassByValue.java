package function;

import java.util.Arrays;

public class PassByValue {

	public static void main(String[] args) {

//		String name = "Max";
//		changeName(name);
//        System.out.println(name);
      int arr[] = {12,1,3,4,5};
   
		change(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	
	
	
//	 static void  changeName(String naam) {
//		 naam = "raj";
//	 }
	
	static void change(int []b) {
		b[0] = 99;
		
	}
	
	
	

}
