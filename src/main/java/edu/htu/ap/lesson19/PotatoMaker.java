package edu.htu.ap.lesson19;

/*
 * Stratgey design pattern: encapsulation for the process into
 * a seprate class, this class could be passed as paramter to
 * the process main method.
 * Changing the process class will change the behaviour of the 
 * original class
 */
public class PotatoMaker {
	int potato;
	int oil;

	public PotatoMaker(int potato, int oil) {
		this.potato = potato;
		this.oil = oil;
	}

	public void makePotato(PotatoDefaultProcess process) {
		process.handle(this);
//		clean();
//		slice();
//		fry();
//		serve();
	}

	protected void clean() {
		System.out.println("cleaning..");
	}

	protected void slice() {
		System.out.println("slicing...");
	}

	protected void fry() {
		System.out.println("frying...");
	}

	protected  void serve() {
		System.out.println("serving...");
	}

	public int getPotato() {
		return potato;
	}

	public void setPotato(int potato) {
		this.potato = potato;
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

}
