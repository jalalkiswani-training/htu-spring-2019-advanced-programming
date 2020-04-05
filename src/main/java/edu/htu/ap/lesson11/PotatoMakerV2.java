package edu.htu.ap.lesson11;

public abstract class PotatoMakerV2 {
	int oil;
	int potato;
	int salt;
	int spicies;
	
	public PotatoMakerV2() {
	}
	
	public PotatoMakerV2(int oil, int potato, int salt) {
		this.oil = oil;
		this.potato = potato;
		this.salt = salt;
	}
	
	private void clean() {
		System.out.println("Cleaning...");
	}
	
	protected abstract void slice() ;
	
	private void fry() {
		System.out.println("Frying....");
	}
	
	private void serve() {
		System.out.println("Serving ....");
	}
	
	public void makePotato() {
		clean();
		slice();
		fry();
		addSpeicies();
		serve();
	}

	private void addSpeicies() {
		System.out.println("Adding spicies....");
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public int getPotato() {
		return potato;
	}

	public void setPotato(int potato) {
		this.potato = potato;
	}

	public int getSalt() {
		return salt;
	}

	public void setSalt(int salt) {
		this.salt = salt;
	}

	public int getSpicies() {
		return spicies;
	}

	public void setSpicies(int spicies) {
		this.spicies = spicies;
	}

	
}
