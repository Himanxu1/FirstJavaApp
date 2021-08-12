package Pracice;

public class Car {
	int maxSpeed = 200;
	int minSpeed = 0;
	double weight = 4333;
	boolean isCarOn = false;
	char condition = 'A';
	String nameOfCar = "lucy";
	 
	double maxFuel = 16;
    double currentFuel = 8;
    
    double mpg = 29.0;
    
    public void printVarible() {
    	System.out.println("This is the maxSpeed" + maxSpeed);
    	System.out.println(maxSpeed);
    	System.out.println(weight);
    	System.out.println(isCarOn);
    	System.out.println(condition);
    	System.out.println(nameOfCar);
    	
    }
    public void upgradMinSpeed() {
    	
    }
	

	public static void main(String[] args) {
		

	}

}
