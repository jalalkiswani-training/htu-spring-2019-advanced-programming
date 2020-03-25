package edu.htu.ap.lesson8;

public class PotatoMaker {
	private int potato;
	private int oil;
	private String spicies;
	private Size dishSize=Size.MEDIUM;

	public void makePotato() {
		peel();
		slice();
		fry();
		if(spicies!=null) {
			addSpicies();
		}
		serve();
	}
	
	public void peel() {
		System.out.println("Peeling...");
	}

	public void slice() {
		System.out.println("Slicing...");
	}

	public void fry() {
		System.out.println("Frying ....");
	}

	public void addSpicies() {
		System.out.println("Adding : "+spicies);
	}
	
	public void serve() {
		System.out.println("Serving in size :"+dishSize);
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

	public String getSpicies() {
		return spicies;
	}

	public void setSpicies(String spicies) {
		this.spicies = spicies;
	}

	public Size getDishSize() {
		return dishSize;
	}

	public void setDishSize(Size dishSize) {
		this.dishSize = dishSize;
	}

	
	
}
