package edu.htu.ap;

import java.util.Scanner;
/***
 * This class is a simple command line calculator that:
 * 1- Read n1 from user
 * 2- Read n2 from user
 * 3- Show menu 
 * 		1- Add
 * 		2- Sub
 * 		3- Mul
 * 		4- Div
 * 4- User shall select the choice 
 * 5- The result should be printed
 * @author Jalal.Kiswani
 *
 */
public class Test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("N1 : ");
		int n1 = scanner.nextInt();
		
		System.out.println("N2 : ");
		int n2 = scanner.nextInt();

		System.out.println("1- Add");
		System.out.println("2- Sub");
		System.out.println("3- Mul");
		System.out.println("4- Div");
		int ch = scanner.nextInt();

		switch (ch) {
		case 1:
			System.out.println(n1 + n2);
			break;
		case 2:
			System.out.println(n1 - n2);
			break;
		case 3:
			System.out.println(n1 * n2);
			break;
		case 4:
			System.out.println(n1 / n2);
			break;
		default:
			break;
		}

	}
}
