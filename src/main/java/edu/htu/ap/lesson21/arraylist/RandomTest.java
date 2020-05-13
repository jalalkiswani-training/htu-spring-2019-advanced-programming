package edu.htu.ap.lesson21.arraylist;

import java.util.Random;

public class RandomTest {
	public static int generateRenadomNumber() {
		Random r = new Random();
		return Math.abs(r.nextInt() % 100);
	}

}
