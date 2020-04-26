package edu.htu.ap.review;

public class Person {
	//instance variables: variables on the class level (outside all methods)
	String name;
	
	//constructor: method with the same name of the class with no return value
	//the const could be only called with the "new" keyword
	//default constructor
	public Person() {		
	}
	
	//constructor overloading: having more than one constructor in the class
	public Person(String name) {
		//the variable declared inside the method is called "Local Variable" 
		//shaddowing: having a local variable with the same name of instance var
		this.name=name;
	}
	
	//method: WITHOUT static modifier
	public void talk() {
		//methods can access the instance variables 
		System.out.println("Hi my name is "+name);
	}
}
