package edu.htu.ap.lesson16;

public class Test {
	public static void main(String[] args) {
//		Employee emp=new Employee();
//		emp.setId(5);
//		emp.setName("Ata");
//		emp.setSalary(20);
		Employee emp = new Employee(5, "Ata", 500);
		emp.setAlownces(200);
		emp.setDeductions(50);
		
		//result should be: 
		System.out.println(emp.calculateFinalSalary());
		
		Manager manager=new Manager(10, "Abdallah", 5000);
		manager.setAlownces(100);
		manager.setDeductions(50);
		manager.setLevel(1);
		
		System.out.println(manager.calculateFinalSalary());
		
	}
}
