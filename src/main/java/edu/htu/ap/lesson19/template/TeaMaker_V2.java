package edu.htu.ap.lesson19.template;

public abstract class TeaMaker_V2 {
	int tea;
	int sugar;
	int water;

	public TeaMaker_V2() {
	}

	public TeaMaker_V2(int tea, int sugar, int water) {
		this.tea = tea;
		this.sugar = sugar;
		this.water = water;
	}
	
	/**
	 * Template method: a method that contains a full prrocess
	 * where every action is encapsulated in a function.
	 * Any function could be overriden in the subclass to 
	 * change that part of the process
	 * 
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

	public abstract void addSugar() ;

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
