package ReverseArray;

public class main {

	public static void main(String[] args) {
		
 int ar[] = {10,20,31,34,64};
 int c= ar.length;
 
 reverseArr(ar,c);

		
	}
static void reverseArr(int arr[],int n) {
		
		int b[] = new int[n];
		int j = n;
		for(int i=0;i<n;i++) {
			b[j-1] = arr[i];
			j = j-1;
			
		}
		
		for(int k=0;k<n;k++) {
			System.out.println(b[k] +" ");
			
			 
		}
	

	
}
}
