package edu.htu.ap.lesson7;

public class CoffeeMakerTest {
	//////////////////////////////////////////////
	public static void main(String[] args) {
		testCoffeeMaker1();
		testCoffeeMaker2();
		
		System.out.println("----------------------");
		System.out.println("Coffee Maker , V3");
		CoffeeMaker_v3 cm3=new CoffeeMaker_v3();
		cm3.setWater(-10);
		cm3.setCoffee(10);
		cm3.setSugar(50);
		cm3.prepapreCoffee();
		
		System.out.println(cm3.getCoffee());
	}

	//////////////////////////////////////////////
	private static void testCoffeeMaker2() {
		System.out.println("----------------------");
		System.out.println("Coffee Maker , V2");
		CoffeeMaker_v2 cm2=new CoffeeMaker_v2();
		cm2.water=3;
		cm2.coffee=200;
		cm2.sugar=100;
		
		cm2.prepapreCoffee();
	}

	//////////////////////////////////////////////
	private static void testCoffeeMaker1() {
		System.out.println("Coffee Maker , V1");
		CoffeeMaker_v1 cm1=new CoffeeMaker_v1();
		cm1.water=2;
		cm1.coffee=250;
		cm1.sugar=100;
		
		cm1.boil();
		cm1.addCoffee();
		cm1.addSugar();
		cm1.serve();
	}
}
