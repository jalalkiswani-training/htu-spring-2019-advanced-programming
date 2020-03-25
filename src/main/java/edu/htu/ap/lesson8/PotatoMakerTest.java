package edu.htu.ap.lesson8;

public class PotatoMakerTest {
	public static void main(String[] args) {
		//PotatoMaker : data type
		//pm: reference
		//new PotatoMaker(): construction
		PotatoMaker pm=new PotatoMaker();
		pm.setPotato(10);
		pm.setOil(2);
		pm.setSpicies("Salt");
		
		//the following is the algorithm/application logic of making potato
//		pm.peel();
//		pm.slice();
//		pm.fry();
//		pm.addSpicies();
//		pm.serve();
		pm.makePotato();
		
		PotatoMaker pm2=new PotatoMaker();
		pm2.setOil(3);
		pm2.setPotato(20);
		pm2.setSpicies("Salt/Pepper");
		
//		pm2.peel();
//		pm2.slice();
//		pm2.fry();
//		pm2.addSpicies();
//		pm2.serve();
		pm2.makePotato();
		
		PotatoMaker pm3=new PotatoMaker();
		pm3.setOil(2);
		pm3.setPotato(5);
		pm3.setDishSize(Size.LARGE);
		
		pm3.makePotato();
		
	}
}
