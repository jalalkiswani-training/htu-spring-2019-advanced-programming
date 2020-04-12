package edu.htu.ap.lesson12;

public class TrixGameMain {
	public static void main(String[] args) {
		TrixGame game = new TrixGame();
//		Card[] cards = game.getCards();

		Player[] players = { new Player("Ata"), // 0
				new Player("Essa"), // 1
				new Player("Jamal"), // 2
				new Player("Kamal")// 3
		};

		game.setPlayers(players);
		game.start();

		players = game.getPlayers();
		for (Player player : players) {
			System.out.println("Player  "+player.getName());
			Card[] cards = player.getCards();
			for (Card card : cards) {
				System.out.println(card.getNumber()+" ; "+card.getCardType());
			}
		}

		Player firstPlayer = game.selectFirstPlayer();
		System.out.println(firstPlayer.getName()+" Please start...");
//		for (Card card : cards) {
//			System.out.println(card.getNumber()+" ; "+card.getCardType());
//		}

//		Player player = game.selectFirstPlayer();
//		System.out.println(player.getName()+" Please start");
	}
}
