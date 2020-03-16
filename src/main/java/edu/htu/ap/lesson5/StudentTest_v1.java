package edu.htu.ap.lesson5;

import java.util.Scanner;

public class StudentTest_v1 {
	public static void main(String[] args) {
		int id;
		String name;
		int age;
		
		Scanner s=new Scanner(System.in);
		System.out.print("ID: ");
		id=s.nextInt();
		System.out.print("Name: ");
		name=s.next();
		System.out.print("Age: ");
		age=s.nextInt();
		
		printResults(id, name, age);
		printResults2(id, name, age);
	}

	private static void printResults2(int id, String name, int age) {
		System.out.println(id+","+name+","+age);
	}

	private static void printResults(int id, String name, int age) {
		System.out.println("====================");
		System.out.println("ID   Name   Age");
		System.out.println("====================");
		System.out.println(id+"  "+name+"  "+age);
	}
}
