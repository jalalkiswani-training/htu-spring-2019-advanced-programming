package edu.htu.ap.intro;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		if(n1>n2) { // > , < , >= , <= , == , != 
			System.out.println("Firs number is greater");
		}else {
			System.out.println("Second number is greater");
		}
	}
}
