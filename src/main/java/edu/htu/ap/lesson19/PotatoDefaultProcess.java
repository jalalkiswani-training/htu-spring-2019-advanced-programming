package edu.htu.ap.lesson19;

public class PotatoDefaultProcess {
	public void handle(PotatoMaker pm) {
		pm.clean();
		pm.slice();
		pm.fry();
		pm.serve();
	}
}
