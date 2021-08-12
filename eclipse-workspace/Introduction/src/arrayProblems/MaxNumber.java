package arrayProblems;

public class MaxNumber {

	public static void main(String[] args) {
		int arr[] =  {1,3,6,8,9};
		int maxNum = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>arr[i]) {
				maxNum =arr[i+1];
			}
		}
System.out.println(maxNum);
	}

}
