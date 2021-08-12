package arrayProblems;

public class SegmentProblem {

	static boolean Findindex(int n,int []arr,int x,int k) {
		int i;
		boolean b=false;
				for(i=0;i<n;i=i+k) {
					for(int j=0;j<k;j++) {
						if(i+j<n && arr[i+j]==x)
							break;
						if(j==k)
							return false;
						if(i+j >=n)
							return false;
					}
				}
				if(i>=n)
					return  true;
				else
					return b;
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= new int[] {3,5,2,4,9,3,1,7,3,11,13,3};
		int x=3,k=3;
		int n = arr.length;
		if(Findindex(n,arr,x,k))
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
