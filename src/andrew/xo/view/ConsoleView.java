package src.andrew.xo.view;

import src.andrew.xo.controller.Game;

public class ConsoleView {
	protected Game game;

	public ConsoleView(Game game) {
		this.game = game;
	}

	public void showGameName() {
		System.out.println(game.getGameName());
	}

	public void showPlayersName() {
		System.out.println("---");
		System.out.println(game.getPlayersName());
	}
}