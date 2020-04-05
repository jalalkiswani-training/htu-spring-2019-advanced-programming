package edu.htu.ap.lesson11;

public class Test {
	public static void main(String[] args) {
		PotatoMaker pm=new PotatoMaker(3, 5, 100);
		pm.makePotato();
		
		System.out.println("==================");
		
		CirclesPotatoMaker cpm=new CirclesPotatoMaker();
		cpm.makePotato();
		
		System.out.println("==================");
		FlowerPotatoMaker fpm=new FlowerPotatoMaker();
		fpm.makePotato();
	}
}
