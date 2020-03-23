package edu.htu.ap.lesson7;

public class CoffeeMaker_v2 {
	//Private & public are "Visibility modifiers"
	//instance varaibles (attributes)
	int water;
	int coffee;
	int sugar;
	
	//methods, functions (actions)
	private void boil() {
		System.out.println("Boiling water...");
	}
	
	private void addCoffee() {
		System.out.println("Adding coffee...");
	}
	
	private void addSugar() {
		System.out.println("Adding sugar...");
	}
	
	private void serve() {
		System.out.println("Serving coffeee...");
	}
	
	public void prepapreCoffee() {
		boil();
		addCoffee();
		addSugar();
		serve();
	}
	
}
