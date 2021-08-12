package searchingAlgorithm;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {-4,-1,2,4,7,8,9};
		int key = 7;
		int l=0,r=arr.length-1;
		int result =binarySearch(arr,key,l,r);
		if(result == -1) {
			System.out.println(" not found");
		}else {
			System.out.println("found on"+ result);
		}
		
		
	}
	
	
	static int binarySearch(int a[],int n,int p,int s) {
		while(p<=s) {
			int mid = p+s-1/2;
			if(a[mid]==n) {
				return mid;
			}else if(n>a[mid]) {
				p = mid +1;
			}else {
				s=mid-1;
			}
		}
		return -1;
		
		
	}

}
