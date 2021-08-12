package arrayProblems;

public class QuickSort {

	public static void main(String[] args) {
		
		
		int arr[] = {-1,2,-3,4,8,5,9};
		int j=0,temp;
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i != j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				j++;
				
			}
		}
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]+" ");
		}
		
	}

}
