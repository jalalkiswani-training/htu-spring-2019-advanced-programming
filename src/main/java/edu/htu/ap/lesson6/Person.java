package edu.htu.ap.lesson6;

public class Person {
	//instance variables
	String name;
	int age;
	int weight;
	
	public void talk() {
		//local variable
		//int i=10;
		System.out.println("Hello my name is "+name);
	}
	
	public void sayInfo() {
		System.out.println("My age is :"+age+", and my weight is :"+weight);
	}
}
