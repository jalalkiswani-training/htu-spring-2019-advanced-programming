package edu.htu.ap.lesson19.template;

public class JordanTeaMaker extends TeaMaker_V2{
	
	public JordanTeaMaker (int tea, int sugar, int water) {
		super(tea,sugar,water);
	}

	@Override
	public void addSugar() {
		System.out.println("Adding medium amount of sugar");
	}

}
