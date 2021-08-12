package arrayProblems;

public class FrequencyProblem {

	public static void main(String[] args) {
	
		int arr[]= {1,1,1,1,1,1};
		int count = 0;
		int x = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count = count +1;
			}
			
		}
		System.out.println(count);

	}

}
