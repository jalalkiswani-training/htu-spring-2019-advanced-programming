package edu.htu.ap.lesson19.template;

public class Test {
	public static void main(String[] args) {
		TeaMaker tm=new TeaMaker(10,30,2);
		tm.makeTea();
		System.out.println("===================");
		JordanTeaMaker jtm=new JordanTeaMaker(10, 30, 2);
		jtm.makeTea();
		
		EgyptTeaMaker etm=new EgyptTeaMaker(10,20, 2);
		etm.makeTea();
	}
}
