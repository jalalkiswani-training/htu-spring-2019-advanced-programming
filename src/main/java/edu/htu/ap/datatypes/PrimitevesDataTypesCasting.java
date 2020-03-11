package edu.htu.ap.datatypes;

public class PrimitevesDataTypesCasting {
	public static void main(String[] args) {
//		System.out.println(Byte.MIN_VALUE);
		//implicitCastingExample();
//		safeExpicitCastingExample();
//		unsafeExpicitCasting();
		float f=10.2f;
		//the f at the end enforces the JVM  
		
	}

	private static void unsafeExpicitCasting() {
		int i=200;
		byte b=(byte)i;
		
		System.out.println(i);
		System.out.println(b);
	}

	private static void safeExpicitCastingExample() {
		int i=100;
		byte b=(byte)i;
		
		System.out.println(i);
		System.out.println(b);
	}

	private static void implicitCastingExample() {
		byte b=10;
		
		//implicit casting 
		int i=b;
		
		System.out.println(b);
		System.out.println(i);
	}
}
