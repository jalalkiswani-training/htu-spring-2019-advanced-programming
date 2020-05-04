package edu.htu.ap.lesson18;

import edu.htu.ap.lesson17.A;
import edu.htu.ap.lesson17.B;

public class Test4 {

	public static void print(A a) {
		a.m1();
	}
	
	public static void add(Object o) {
		
	}
	
	public static void main(String[] args) {
		A a=new A();
		print(a);
		
		B b=new B();
		print(b);
		
		add(a);
		add(b);
	}
}
