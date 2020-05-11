package edu.htu.ap.lesson20.decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Decorator design pattern: adding extra fucntinality (decoration) to a wrapped class
 * @author Jalal Kiswani
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("test.txt");
		BufferedReader buf=new BufferedReader(fr);
		
		String line;
		while((line=buf.readLine())!=null) {
			System.out.println(line);
		}
		
//		String str = "";
//		int ch;
//		while ((ch = fr.read()) != -1) {
//			str += (char) ch;
//		}
//		fr.close();
	}
}
