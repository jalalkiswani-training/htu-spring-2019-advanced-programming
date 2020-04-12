package edu.htu.ap.lesson12;

public class Player {
	private String name;
	private Card[] cards=new Card[TrixGame.CARDS_PER_COLOR];
	private int score;

	public Player(String name) {
		this.name = name;
	}

	public boolean hasCard(int number, CardType type) {
		for(Card card: cards) {
			if(card.getNumber()==number && card.getCardType()==type) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setCard(int cardIndex, Card card) {
		cards[cardIndex]=card;
	}

}
