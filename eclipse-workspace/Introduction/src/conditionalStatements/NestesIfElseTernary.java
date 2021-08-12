package conditionalStatements;

public class NestesIfElseTernary {

	public static void main(String[] args) {

		int a = 12, b = 18, c = 10;
		int result = 0;
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		System.out.println("largest of the three number is" + result);
		
	}

}
