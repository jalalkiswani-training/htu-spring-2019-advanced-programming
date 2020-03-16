package edu.htu.ap.lesson5;

import java.util.Scanner;

public class StudentTest_v2 {
	public static void main(String[] args) {
		Student std=new Student();
		readStudent(std);
		printResult(std);
//		printResult2(std);
		System.out.println(std.toString());
	}

	private static void printResult2(Student std) {
//		System.out.println(std.id+","+std.name+","+std.age);
	}

	private static void readStudent(Student std) {
		Scanner s=new Scanner(System.in);
		System.out.print("ID: ");
		std.id=s.nextInt();
		System.out.print("Name: ");
		std.name=s.next();
		System.out.print("Age: ");
		std.age=s.nextInt();
	}

	private static void printResult(Student std) {
		System.out.println("====================");
		System.out.println("ID   Name   Age");
		System.out.println("====================");
		System.out.println(std.id+"  "+std.name+"  "+std.age);
	}
}
