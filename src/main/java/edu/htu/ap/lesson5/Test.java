package edu.htu.ap.lesson5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//FirstClass: class name
		//fClass: reference
		//new FirstClass(): construction 
		FirstClass fClass= new FirstClass();
		fClass.msg="Hello from OOP";
		
		fClass.sayMessage();
	}
}
