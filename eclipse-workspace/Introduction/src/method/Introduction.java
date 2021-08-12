package method;

public class Introduction {

	public static void main(String[] args) {
	int fnumber	=34;
	int snumber =13;
	int result = maxOf(fnumber , snumber);
	 maxOf(100,200);
	System.out.println(result);
	

	
	}
//	Creating method
	
  static int maxOf(int a, int b) {
 if(a>b) {
	 return a;
 }else {
	 return b;
 }
//   static void sayHi() {
//	 System.out.println("hi");
// }
}
}
