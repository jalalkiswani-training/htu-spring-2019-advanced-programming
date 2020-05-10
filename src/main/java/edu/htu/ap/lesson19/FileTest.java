package edu.htu.ap.lesson19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		// writeToFile();
		String str=readFromFile();
//		System.out.println(str);
		String[] arr = str.split("\n");
		for (String line: arr) {
			System.out.println("Line = "+line);
		}
	}

	private static String readFromFile() {
		try {
			FileReader fr = new FileReader("test.txt");
			String str = "";
			int ch;
			while ((ch = fr.read()) != -1) {
				str += (char) ch;
			}
			fr.close();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static void writeToFile() {
		try {
			FileWriter fw = new FileWriter("test.txt");
			for (int i = 0; i < 10; i++) {
				fw.write("Line " + i + "\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
