package arrayProblems;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[]= {8,4,1,5,9,2};
		for(int i=1;i<arr.length;i++) {
			int temp= arr[i];
			int j=i-1;
			while(j>=0  && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
			
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
		

	}

}
