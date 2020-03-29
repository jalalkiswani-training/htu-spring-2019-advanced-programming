package edu.htu.ap.others;

public class BinaryCalc_V1 {
	public static void main(String[] args) {
		String n1="1001100";
		String n2="1110011";
		
		int decimal1=Integer.parseInt(n1,2);
		int decimal2=Integer.parseInt(n2,2);
		
		System.out.println(decimal1+decimal2);
	}
}
