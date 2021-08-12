package loops;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		
		
//		for( int j = 1; j<=5; j++) {
//		for(int i = 1; i<=10; i++) {
//		
//			System.out.print(i+ " ");
//			
//			
//		}System.out.println();
//		
//		}
//	for(int j=1; j<=11; j++) {
//		for(int i=1; i<=20; i++) {
//			System.out.print(i*j + " ");
//		}System.out.println();
//			
//	}
//		int n = 4; 
//		for(int j=1; j<=n; j++) {
//		 for(int i=1; i<=n-1; i++) {
//			 System.out.print("  ");
//		 }
//		 for(int i=1; i<=n; i++ ) {
//			 System.out.print(" * ");
//		 }System.out.println();
//		}
		
		
		
		
		
		
		
//		int n =20;
//		for(int i =1; i<=n; i++) {
//			for(int j=1; j<=n-1; j++ ) {
//				System.out.print("  ");
//			}
//		for(int j=1; j<=i; j++) {
//			System.out.print("*  ");
//		}System.out.println();
//			
//		}
		
		
		
		
//		int n = 5;
//		float j = 2.5444f;
//		double k = 209.1333;
//		System.out.println(k);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		  int temp =n;
		  int sum = 0;
		  while(temp > 0) {
			  int lastDigit = temp % 10;
			  temp = temp/10;
			  sum += lastDigit;
		  }System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
