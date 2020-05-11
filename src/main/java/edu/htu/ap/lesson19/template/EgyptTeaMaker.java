package edu.htu.ap.lesson19.template;

public class EgyptTeaMaker extends TeaMaker_V2{
	
	public EgyptTeaMaker (int tea, int sugar, int water) {
		super(tea,sugar,water);
	}

	@Override
	public void addSugar() {
		System.out.println("Adding alot of sugar");
	}

}
