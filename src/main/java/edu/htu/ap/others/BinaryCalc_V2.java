package edu.htu.ap.others;

public class BinaryCalc_V2 {
	public static void main(String[] args) {
		String n1="1001100";//     64:1  32:0  16:0 8:1 4:1 2:0  1:0
		String n2="1110011";
		
		int decimal1=convertToDecimal(n1);
		int decimal2=convertToDecimal(n2);
		
		System.out.println(decimal1+decimal2);
	}

	private static int convertToDecimal(String n) {
		char[] charArray = n.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[0]);
		}
		return 0;
	}
}
