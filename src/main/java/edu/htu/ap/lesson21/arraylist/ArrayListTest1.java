package edu.htu.ap.lesson21.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest1 {
	public static void main(String[] args) {
		// ArrayList: dynamic array that could be expanded and shrinking dynamically
		// <>: is called generics to inforce the list to be of specific type
		// in generic data types, we should put "<>" before the constructor
		ArrayList<Integer> list = new ArrayList<>();
		list.add(50);//0
		list.add(70);//1
		list.add(90);//2
		
		int number=list.get(1);
		System.out.println(number);
	}
}
