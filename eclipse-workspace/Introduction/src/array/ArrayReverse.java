package array;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		
		
//		int a[] = {1,2,3,4,5};
//		int N = a.length;
//		for(int i=0;i<N/2;i++) {
//			int temp = a[i];
//			a[i] = a[N-1-i];
//			a[N-1-i] = temp;
//		}
// 		
//		for(int i=0;i<N;i++) {
//			System.out.print(" " +a[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n/2; i++) {
			int temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
		for(int i=0; i<n ; i++) {
			System.out.print(" "+a[i]);
		}
		
		

	}

}
