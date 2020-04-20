package edu.htu.ap.lesson14;

public class Person {
	//static variable: class variable
	public static String GENDER_MALE = "1";
	public static String GENDER_FEMALE = "2";
	
	// instance variables
	private int id;
	private String name;

	public void sayHi() {
		// + next to a string will cause a string concatination
		System.out.println("Hello my name is " + name + ", and my id is:" + id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
