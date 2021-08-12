package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
System.out.println(" enter the number of students");
       int n = sc.nextInt();
  double marks[] = new double[n];
  
  
  System.out.println("enter the numbers");
  for(int i = 0; i<n; i++) {
  
  marks[i] = sc.nextInt();
  
  }
  double averageMarks = 0;
  for(int i = 0; i<n; i++) {
  
  
  averageMarks += marks[i];
  }
  
  averageMarks /= n;
  
  System.out.println("the average marks are " + averageMarks);
  
  
	}

}
