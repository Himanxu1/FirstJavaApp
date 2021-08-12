package arrayProblems;

public class SideCheck {

	public static void main(String[] args) {
		
		int arr[] = {0,6,2,3,1,2,5};
		
		int n = arr.length-1;
		int l =0;
		int m=0;
		int p=0;
		int mid = (l+n)/2;
		for(int i=0;i<=mid-1;i++) {
			m = m+arr[i];
			
		}
		
		for(int j=mid+1;j<=n;j++) {
			p = p+ arr[j];
			
		}
		
		if(m==p) {
			System.out.println("Found");
		}else {
			System.out.println("not found");
		}
		

	}

}

