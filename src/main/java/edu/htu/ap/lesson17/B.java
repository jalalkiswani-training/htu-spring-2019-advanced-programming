package edu.htu.ap.lesson17;
//subclass / child
public class B extends A {
	@Override // annotation: something starts with "@" sign
	public void m1() {
		System.out.println("m1 from B: overriden");
	}

	public void m3() {
		System.out.println("m3 from B");
	}
}
