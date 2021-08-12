package arrayProblems;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of array");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter element");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
sc.close();


for(int j=0;j<n;j++) {
	System.out.print(arr[j]+" ");
}

	}

}
