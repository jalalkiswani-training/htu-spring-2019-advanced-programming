package edu.htu.ap.lesson18;

import edu.htu.ap.lesson17.A;
import edu.htu.ap.lesson17.B;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		A a2 = new B();// implicit casting
		// B b2=new A();//sub points to super??: compile time error
		a2.m1();// overridden => polymorphism

		B b2 = (B) a2;// sub-class points to super will cause compile time error.
		// if I am sure that the original object is from the type B, then I can
		// do an explicit casting
		b2.m1();// this will print the overriden

		if (a instanceof B) {//this will return false
			B b3 = (B) a;// java.lang.ClassCastException
		}
	}
}
