package arrayProblems;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,9};
		int n = arr.length;
	
		
		
	int m=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]+1 == arr[i+1]) {
			
				
			}else {
				m = arr[i]+1;
			}
			
			
			
			
		}
		System.out.println(m);
	

	}

}
