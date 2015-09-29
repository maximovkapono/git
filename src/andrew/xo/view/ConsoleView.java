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

	public void showBoard() {
        for (int i = 0; i < 3; i++) {
            showRow(i);
        }
    }

    private void showRow(int row) {
        for (int i = 0; i < 3; i++) {
            System.out.print(game.getBoard().getFigure(i, row) + " ");
        }
        System.out.println();
    }

    public void showPlayersName() {
		System.out.println("---");
		System.out.println(game.getPlayersName());
	}
}