package edu.htu.ap.intro.tbd;

import java.util.Scanner;

/*
 * Read from the user:
 * 1- Employee ID's
 * 2- Employee names
 * 3- Employee salaries
 * 
 * ---------------
 * Print out: average salary , min salary , max salary along with the employee names
 * 
 */
public class Test_v1 {
	public static void main(String[] args) {
		int n = 5;
		int ids[] = new int[n];
		String names[] = new String[n];
		int salaries[] = new int[n];
		
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			int id=s.nextInt();
			String name=s.next();
			int salary=s.nextInt();
			//validate value
			ids[i]=id;
			names[i]=name;
			salaries[i]=salary;
		}
		
	}
}
