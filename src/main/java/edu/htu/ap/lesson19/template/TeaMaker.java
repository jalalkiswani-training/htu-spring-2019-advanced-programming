package edu.htu.ap.lesson19.template;

public class TeaMaker {
	int tea;
	int sugar;
	int water;

	public TeaMaker() {
	}

	public TeaMaker(int tea, int sugar, int water) {
		this.tea = tea;
		this.sugar = sugar;
		this.water = water;
	}
	
	/**
	 * Simple method to call conmplex business logic ===> Facade Design Pattern
	 */
	public void makeTea() {
		boil();
		addSugar();
		addTea();
		serve();
	}

	public void boil() {
		System.out.println("Boiling...");
	}

	public void addSugar() {
		System.out.println("Adding sugar..");
	}

	public void addTea() {
		System.out.println("Adding tea...");
	}

	public void serve() {
		System.out.println("Serving...");
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

}
