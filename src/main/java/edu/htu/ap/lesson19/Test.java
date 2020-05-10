package edu.htu.ap.lesson19;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class Test {
	public static void main(String[] args) {
		PotatoMaker pm=new PotatoMaker(5, 2);
		
//		PotatoDefaultProcess p1=new PotatoDefaultProcess();
//		pm.makePotato(p1);
		
		OtherPotatoMakerProcess p2=new OtherPotatoMakerProcess();
		pm.makePotato(p2);
	}
}
