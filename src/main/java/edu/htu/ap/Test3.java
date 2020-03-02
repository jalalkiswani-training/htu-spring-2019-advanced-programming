package edu.htu.ap;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("==============================");
		System.out.println("Welcome to my First Calculator");
		System.out.println("==============================");
		System.out.print("Please enter n1: ");
		int n1=scanner.nextInt();
		System.out.print("Please enter n2: ");
		int n2=scanner.nextInt();
		System.out.println("==============================");		int sum=n1+n2;

		System.out.println("Result = "+sum);
		System.out.println("==============================");
	}
}
