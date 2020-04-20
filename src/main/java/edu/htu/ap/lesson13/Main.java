package edu.htu.ap.lesson13;

public class Main {
	public static void main(String[] args) {
		FileHandler c1=FileHandler.getInstance();
		FileHandler c2=FileHandler.getInstance();
		FileHandler c3=FileHandler.getInstance();
		
//		FileHandler c1=FileHandler.getInstance();
//		FileHandler c2=FileHandler.getInstance();
//		FileHandler c3=FileHandler.getInstance();

//		FileHandler c1=new FileHandler();
//		FileHandler c2=new FileHandler();
//		FileHandler c3=new FileHandler();
		
		c1.writeToFile("Hello");
		c2.writeToFile("Hello2");
		c3.writeToFile("Hello3");

		System.out.println(c1.getCounter());
		System.out.println(c2.getCounter());
		System.out.println(c3.getCounter());
	}
}

