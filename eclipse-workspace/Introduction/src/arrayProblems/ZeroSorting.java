package arrayProblems;

public class ZeroSorting {

	public static void main(String[] args) {

		int arr[]= {0,1,0,1,0,1,0,1,2,2,0,0,2,1};
		int count = 0;
		
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]==0) {
				count = count +1;
				
			}
			
		}
		
		int ones = count;
		for(int v=0;v<arr.length;v++) {
			if(arr[v]==1) {
				ones = ones +1;
			}
		}
		
		for(int i1=0;i1<count ;i1++) {
			arr[i1]=0;
			
		}
		for(int k=count;k<ones;k++) {
			arr[k]=1;
			
		}
		for(int s=ones;s<arr.length;s++) {
			arr[s]=2;
		}
		
		
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]+" ");
		}
		
		
		
	}

}
