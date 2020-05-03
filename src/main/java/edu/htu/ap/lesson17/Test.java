package edu.htu.ap.lesson17;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("=====================");
		A a=new A();
		a.m1();//m1 from A
		a.m2();//m2 from A
		System.out.println("=====================");
		B b1=new B();
		b1.m1();//m1 from B: overriden
		b1.m2();//m2 from A
		b1.m3();//m3 from B
		System.out.println("=====================");		
		A a2=a;
		a2.m1();//m1 from A
		a2.m2();//m2 from A
		System.out.println("=====================");
		
		/* reference from super class points to an object of subclass
		 * this will cause implicit casting
		 * 
		 */
		A a3=b1;
		/*
		 * Polymorphism: 
		 * 1) a reference from super class points to an object of subclass
		 * 2) when calling an overrriden method, the method will be called 
		 * on the subclass
		 */
		a3.m1();//m1 from B: overriden: 
		a3.m2();//m2 from A
		
	}
}
