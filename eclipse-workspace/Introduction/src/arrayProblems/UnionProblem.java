package arrayProblems;

import java.util.Arrays;

public class UnionProblem {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3};
		int n = a.length;
		int m = b.length;
		int k = m+n;
		int c[]=new int[k];
		for(int i=0;i<n;i++) {	
			c[i]= a[i];
		}
		for(int i=0;i<m;i++) {
			c[n+i]=b[i];
		}
		
		for(int j=0;j<k;j++) {
			System.out.print(c[j]+" ");
			
		}
		System.out.println();
		Arrays.sort(c);
		System.out.printf(""+ Arrays.toString(c));
		
	}

}
