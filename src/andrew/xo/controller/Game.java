package src.andrew.xo.controller;

import src.andrew.xo.model.Board;
import src.andrew.xo.model.Player;

public class Game {
    private static final int MIN_SIZE = 0;
    private static final int MAX_SIZE = 3;

    private String GAME_NAME = "XO";
	private Player[] players;
    private Board board = new Board();

	public String getGameName() {
		return this.GAME_NAME;
	}

	public Player currentPlayer() {
		return null;
	}

    public Board getBoard() {
        return board;
    }

    public boolean move(int x, int y) {
        assert x >= 0;
        assert y >= 0;

        if (!checkCoordinate(x) || !checkCoordinate(y)) {
            return false;
        }

        //TODO write logic

        return true;
	}

	public Player[] getPlayersName() {
		return this.players;
	}

    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_SIZE || coordinate >= MAX_SIZE) {
            return false;
        }

        return true;
    }
}