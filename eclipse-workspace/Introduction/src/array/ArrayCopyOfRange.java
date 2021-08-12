package array;
import java.util.Arrays;
public class ArrayCopyOfRange {

	public static void main(String[] args) {
		
//		char [] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
//		
//		char [] copyTo = Arrays.copyOfRange(copyFrom, 0, 3);
//              System.out.println(copyTo);
//              
              
		int arr[] = { 12, 13, 14, 15, 16, 17, 18};
		int copy[] = Arrays.copyOfRange(arr, 2, 6);
		for(int i : copy)
		{
			System.out.println(i + " ");
		}
              
              
	}

}
