package edu.htu.ap.lesson16;

/*
 * Subclass , child-class
 */
public class Manager extends Employee {
	private Department department;
	/*
	 * level 1: allownces * 2 level 2: allwonces * 1.5 level 3: allownces * 1.25
	 */
	private int level;

	public Manager() {
	}

	public Manager(int id, String name, double salary) {
		super(id, name, salary);
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	/*
	 * Rewrite a method from the super class in the subclass
	 * to change the behavior (with the same signiture): "Method override"
	 */
	public double calculateFinalSalary() {
		double allwoences = this.getAlownces();
		if (level == 1) {
			allwoences = allwoences * 2;
		} else if (level == 2) {
			allwoences = allwoences * 1.5;
		} else if (level == 3) {
			allwoences = allwoences * 1.25;
		}
		double finalSalary = getBasicSalary() + allwoences - getDeductions();
		return finalSalary;
	}

}
