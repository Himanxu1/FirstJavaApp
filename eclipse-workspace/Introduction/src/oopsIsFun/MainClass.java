package oopsIsFun;

public class MainClass {

	public static void main(String[] args) {


//   Person p1 = new Person();
//   p1.age = 19;
//   p1.name = "Himanshu";
//    
//     Person p2 = new Person(31,"rocky");
//   System.out.println(p1.age + " " + p1.name);
//   System.out.println(p2.age + " " + p2.name);
//   
//   p1.walk(2);
//   p2.walk();
//   p1.eat("burger");
//   System.out.println(Person.count);
   
	Developer d1 = new Developer(24,"ansul");
	d1.walk();
	
		
	}

}

class Developer extends Person{
	public Developer(int age, String name) {
	super(age,name);
	}
}

class Person{
	String name;
	  int age;
	 static int count;
//	public Person() {
//	count++;
//		System.out.println(" object is created ");
//	}
	public Person(int age, String name) {
		
	this.name = name;
	this.age = age;
	}
	
	void walk() {
		System.out.println( name + " is walking");
	}
	void eat(String fastfood) {
		System.out.println(name + " is eating " + fastfood + " fastly");
	}
	void walk(int steps) {
		System.out.println(name + " walked " + steps +" steps");
	}
	void doWork() {
		System.out.println("Person is working");
	}
}
