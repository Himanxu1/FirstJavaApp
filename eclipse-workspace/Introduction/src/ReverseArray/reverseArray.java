package ReverseArray;

public class reverseArray {

	static void reverseArr(int arr[],int n) {
		
		int b[] = new int[n];
		int j = n-1;
		for(int i=0;i<n;i++) {
			b[j-1] = arr[i];
			j = j-1;
			
		}
		
		for(int k=0;k<n;k++) {
			System.out.println(b[j] +" ");
			
			 
		}
		
		
	}
	
	
}
