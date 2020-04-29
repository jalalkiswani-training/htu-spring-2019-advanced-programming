package edu.htu.ap.lesson16;

/*
 * Parent class / Super class
 */
public class Employee {
	private int id;
	private String name;

	private double basicSalary;
	private double deductions;
	private double alownces;

	private String email;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.basicSalary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double salary) {
		if (salary < 0) {
			System.out.println("Invalid values");
		} else {
			this.basicSalary = salary;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getAlownces() {
		return alownces;
	}

	public void setAlownces(double alownces) {
		this.alownces = alownces;
	}

	public double calculateFinalSalary() {
		double finalSalary = basicSalary + alownces - deductions;
		return finalSalary;
	}
}
