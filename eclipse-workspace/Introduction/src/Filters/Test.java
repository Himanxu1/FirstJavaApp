package Filters;
import java.io.File;
public class Test {

	public static void main(String[] args) {
		
		File input = new File("C:\\Users\\acerpc\\Desktop\\name.jpg");
		File output = new File("C:\\Users\\acerpc\\Desktop\\greyscale.jpg");
		greyscale.toGreyScale(input,output);
		System.out.println("Completed");
		
		
		
	}

}
