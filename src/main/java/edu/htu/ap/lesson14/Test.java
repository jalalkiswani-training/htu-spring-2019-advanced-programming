package edu.htu.ap.lesson14;

public class Test {
	public static void main(String[] args) {
		//Person: Datatype - classname
		//p: reference
		//new Person(): construction of a new "object" in the memory with difference space for the instance var		
		Person p1=new Person(); 
		//to access an method inside a class, it shold be called through the reference
		p1.setId(5);
		p1.setName("Ata");
		p1.sayHi();
		
		Person p2=new Person();
		p2.setId(10);
		p2.setName("Essa");
		p2.sayHi();
		
		p1.sayHi();
		
		System.out.println(Person.GENDER_FEMALE);
	}
}
