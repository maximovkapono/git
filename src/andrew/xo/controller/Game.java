package src.andrew.xo.controller;

import src.andrew.xo.model.Player;

public class Game {

	private String GAME_NAME = "XO";
	private Player[] players;

	public String getGameName() {
		return this.GAME_NAME;
	}

	public Player currentPlayer() {
		return null;
	}

	public boolean move(int x, int y) {
		return false;
	}

	public Player[] getPlayersName() {
		return this.players;
	}
}