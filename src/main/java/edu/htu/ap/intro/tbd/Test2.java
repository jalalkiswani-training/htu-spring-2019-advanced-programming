package edu.htu.ap.intro.tbd;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int n=5;
		/*
		 * ArrayList: dynamic array
		 * <...>: this called generics, to force the array to take a specific data type
		 */
		ArrayList<Employee> employees=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			//construct the object
			Employee emp = new Employee();
			//set values
			emp.setId(s.nextInt());
			emp.setName(s.next());
			emp.setSalary(s.nextInt());
			
			//add object to the list
			employees.add(emp);
		}
		
		//Employee employeeWithMaxSalary=null;
		//foreach
		for (Employee employee : employees) {
			
		}
		
		//is equavalenet to the above loop
		for(int i=0;i<employees.size();i++) {
			Employee employee=employees.get(0);
		}
		
		
	}
}
