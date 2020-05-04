package edu.htu.ap.lesson18;

import java.util.ArrayList;

import edu.htu.ap.review.Person;

public class GenericsTest {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
//		list.add(new Person());
		list.add("Ata");//index 0
		list.add("Essa");//index 1
		list.add("Jamal");//index 2
				
		System.out.println(list.size());
		String str=(String) list.get(0);
		
		System.out.println(str);
	}
}
