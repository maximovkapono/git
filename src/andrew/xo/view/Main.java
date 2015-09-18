package src.andrew.xo;

import src.andrew.xo.controller.Game;
import src.andrew.xo.view.ConsoleView;
import src.andrew.xo.view.AdvConsoleView;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		AdvConsoleView advConsoleView = new AdvConsoleView(game);
		startGame(advConsoleView);
	}

	private static void startGame(ConsoleView consoleView) {
		consoleView.showGameName();
	}
}