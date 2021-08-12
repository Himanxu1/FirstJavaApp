package oops;
class vehicals{
	int wheels ;
	vehicals(int numberOfWheels) {
		wheels = numberOfWheels;
		
	}
	
	
}
public class MyConstructor {
	MyConstructor(){
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
		
		vehicals cars = new vehicals(2);
		vehicals car1 = new vehicals(3);
		
		System.out.println(car1.wheels);

	}

}
