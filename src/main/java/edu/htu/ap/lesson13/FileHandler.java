package edu.htu.ap.lesson13;

import java.io.FileWriter;
import java.io.IOException;

//singleton
/**
 * 1-make the constructor private: with this no body will be able to create a
 * new object 2- create a static variable from the same type of the class public
 * static FileHandler instance = new FileHandler() 3- If any class would like to
 * use this instance, it should get the reference of the static variable 4-
 * Create a static method to return the single instance
 *
 */
public class FileHandler {
	int counter = 0;
	private static FileHandler instance = new FileHandler();

	public static FileHandler getInstance() {
		return instance;
	}

	// only can be accessedd within the class
	private FileHandler() {

	}

	public void writeToFile(String msg) {
		try (FileWriter fw = new FileWriter("test.txt",true)) {
			counter++;
			fw.write(msg+"\n");
			System.out.println("Writing msg to file:" + msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getCounter() {
		return counter;
	}

}
