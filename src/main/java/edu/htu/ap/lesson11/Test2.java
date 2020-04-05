package edu.htu.ap.lesson11;

public class Test2 {
	public static void main(String[] args) {
		//The following is compile time erro because abstract classes 
		//cannot be constructed, simply because its not complete/concrete
//		PotatoMakerV2 pm2=new PotatoMakerV2();
//		pm2.makePotato();
		
		SticksPotatoMaker spm=new SticksPotatoMaker();
		spm.makePotato();
	}
}
