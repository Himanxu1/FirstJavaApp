package function;

public class LargenNumber {

public static void main(String[] args) {
     int s = 10;
     int m = 21;
     int ans=sum(s,m);
     System.out.println(ans);

}
	
 static int sum(int a ,int b) {
	if(a>b) {
		return a;
	}else {
		return b;
	}
	
}

}
