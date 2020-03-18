package edu.htu.ap.lesson6;

public class PersonTest1 {
	public static void main(String[] args) {
		/**
		 * If a reference has no value (points to null), any call
		 * to an instance variable or a method on that reference 
		 * will cause a runtime exception, NullPointerException
		 */
		Person p=null;
		p.name="Ata";
		
		/*
		 Exception in thread "main" java.lang.NullPointerException
		 at edu.htu.ap.lesson6.PersonTest.main(PersonTest.java:6)
		 */
	}
}
