package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {

		int a =117;
		int b =144;
		int c =169;
		if(a>b) {
		   if(a>c) {
		System.out.println("a is greater");
		}else {
		System.out.println("c is greater");
		}
		}else {
	if(b>a) {
		System.out.println("b is greater");
	
	} else {
	System.out.println("c is greater");
	 }
		}
		
	}

}
