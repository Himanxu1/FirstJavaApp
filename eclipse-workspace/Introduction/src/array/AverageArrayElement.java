package array;

import java.util.Scanner;

public class AverageArrayElement {

	public static void main(String[] args) {
		
		int n,sum=0;
		float average;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of element you want in array : ");
		n = sc.nextInt();
		int a[] =new int[n];
		System.out.println("enter all elements :" );
		for(int i=0; i<n; i++ ) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
			
		}
			System.out.println("Sum of the array elements is : " + sum );	
	
			average = (float)sum/n;
			
		System.out.println("the Average of the arrays elements  " + average);
		

	}

}
