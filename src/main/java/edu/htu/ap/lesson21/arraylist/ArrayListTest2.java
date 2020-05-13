package edu.htu.ap.lesson21.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(101, "Ata"));//0
		empList.add(new Employee(102, "Essa"));//1
		empList.add(new Employee(103, "Kamal"));//2
		empList.add(new Employee(104, "Jamal"));//2
		empList.add(new Employee(105, "Saleem"));//2
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter emp id: ");
		int id=s.nextInt();
		
		for (Employee employee : empList) {
			if(employee.getId()==id) {
				System.out.println(employee.getName());
				break;
			}
		}
		
	}
}
