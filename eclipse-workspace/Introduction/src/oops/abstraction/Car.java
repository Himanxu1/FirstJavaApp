package oops.abstraction;


//Here class must be abstract 
public abstract class Car {
	
	//abstract method
public abstract void accelerate(); 
			
	//abstract method
	public abstract void braking(); 
	
	// Concrete or regular method
	public void honk() {
		System.out.println("Car is honking");
	}
		
	

}
