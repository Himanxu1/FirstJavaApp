package userInput;

import java.util.Arrays;

public class ScannerUserInput {
//	 we use two pointer algorithm here
	static void alternateSort(int arr[], int n) {
		
		Arrays.sort(arr);
		
		int i=0, j = n-1;
		while(i<j) {
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] + " ");
		}if (n % 2 != 0)
			System.out.println(arr[i]);
		
	}

	public static void main(String[] args) {
   
		
		int arr[] = {7, 3 , 4 ,2, 1 , 5, 6};
		int n = arr.length;
		alternateSort(arr,n);
		
		
      
      
      
      
//		int principle = sc.nextInt();
//		float rate =sc.nextFloat();
//		
//		int time = sc.nextInt();
//		float simpleInterest = principle * rate * time / 100;
//		System.out.println("the simple interest is"  +   simpleInterest);
		
		
		
}

}
