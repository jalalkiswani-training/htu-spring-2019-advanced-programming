package edu.htu.ap.lesson4;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		//String : class name
		//str: var name/reference
		//new String("hello") : constuction
		String str=new String("Hello");		
		String str2="Ata";
		//print the string length
		String msg = str+" "+str2;
		System.out.println(msg);
		System.out.println("Length : "+str2.length());
		
		if(msg.toLowerCase().contains("ata")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		System.out.println(msg);
		//String is immutable
		System.out.println("=====================");
		String test="ABCDEFG";//A:0 B:1 C:2 
		String test2=test.substring(2,4);
		test.toLowerCase();
		double d=10d;
		
		System.out.println(test);
		System.out.println(test2);
	}
}
