package array;
import java.util.Arrays;



public class ArraySort {

	public static void main(String[] args) {
		
		String arr[] = {"Programming","Java","Codes","Gits","Awesome" };
		Arrays.sort(arr);
		
		System.out.println("The sorted array is:");
		
		System.out.println("the sorted array is" + Arrays.toString(arr));
		
		
		for(int i = 0; i<arr.length;  i++)
		{
			System.out.println(arr[i]);
		}
		


		
		
		
		
		
		
		
	}

}
