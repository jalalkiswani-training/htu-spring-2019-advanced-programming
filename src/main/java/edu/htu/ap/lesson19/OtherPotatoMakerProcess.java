package edu.htu.ap.lesson19;

public class OtherPotatoMakerProcess  extends PotatoDefaultProcess{

	@Override
	public void handle(PotatoMaker pm) {
		pm.slice();
		pm.fry();
		pm.serve();
	}
}
