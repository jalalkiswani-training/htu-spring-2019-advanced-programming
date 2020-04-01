package edu.htu.ap.lesson9;

public class Test_Car_V2 {
	public static void main(String[] args) {
		Brand mercedes=new Brand();
		mercedes.setName("Mercedes-Benz");
		mercedes.setWebsite("http://wwww.mecerdes.com");
		mercedes.setHomeCompanyName("Daimler");
		
		Dealer gargour=new Dealer();
		gargour.setName("Gargour");
		gargour.setPhone("13456789");
		gargour.setBrands(mercedes);
		
		Engine engine1=new Engine();
		engine1.setCylenders(4);
		engine1.setHoursePower(156);
		engine1.setTurbo(true);
		engine1.setHealth(60);
		
		CarV2 c1=new CarV2();
		c1.setColor("Red");
		c1.setDealer(gargour);
		c1.setEngine(engine1);
		c1.setModel(2010);
		c1.setPrice(10000);
		c1.setVin("hjkjhkjhjkhkj");
		
		Engine engine2=new Engine();
		engine2.setCylenders(4);
		engine2.setHoursePower(156);
		engine2.setTurbo(true);
		engine2.setHealth(80);
		
		CarV2 c2=new CarV2();
		c2.setDealer(gargour);
		c2.setEngine(engine2);//??
		c2.setModel(2018);
		c2.setPrice(20000);
		c2.setVin("987897897");
		
		System.out.println(c1.getDealer().getPhone());
		System.out.println(c2.getDealer().getPhone());
		
		gargour.setPhone("98765431");
		System.out.println(c1.getDealer().getPhone());
		System.out.println(c2.getDealer().getPhone());
				
	}

}
