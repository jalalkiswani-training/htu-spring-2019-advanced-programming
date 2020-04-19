package edu.htu.ap.lesson12;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrixGame {
	public static final int CARDS_PER_COLOR = 13;
	public static final int CARDS_PER_PLAYER= 13;
	// constant
	public static final int CARDS_COUNT = 52;
	private Player[] players;
	private Card[] cards;

	// tested
	public TrixGame() {
		initCards();
	}

	// tested
	private void initCards() {
		// init cards array with 52 cards, 13 from each type
		cards = new Card[CARDS_COUNT];
		CardType[] values = CardType.values();
		int index = 0;
		for (CardType cardType : values) {
			for (int i = 0; i < CARDS_PER_COLOR; i++) {
				Card card = new Card(i + 1, cardType);
				cards[index++] = card;
			}
		}
	}

	//tested
	public void start() {
		shuffle();
		dealCards();
	}

	// tested
	protected void shuffle() {
		Random rnd = ThreadLocalRandom.current();
		for (int i = cards.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			Card a = cards[index];
			cards[index] = cards[i];
			cards[i] = a;
		}
	}

	//tested
	protected void dealCards() {
		int totalCardsIndex=0;
		for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
			Player currentPlayer = players[playerIndex];

			for (int cardIndex = 0; cardIndex < CARDS_PER_COLOR; cardIndex++) {
				Card currentCard=cards[totalCardsIndex];			
				currentPlayer.setCard(cardIndex, currentCard);
				
				totalCardsIndex++;
			}
		}
	}

	//tested
	public Player selectFirstPlayer() {
		for(Player player :players) {
			if(player.hasCard(7,CardType.HEARTS)) {
				return player;
			}
		}
		throw new IllegalStateException("There an internal bug");
		//this method should be unreachable
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

}
