package src.andrew.xo;

import src.andrew.xo.controller.Game;
import src.andrew.xo.model.Board;
import src.andrew.xo.model.Figure;
import src.andrew.xo.view.AdvConsoleView;
import src.andrew.xo.view.ConsoleView;

public class Main {

	public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println(figure.toString());
    }

	private static void startGame(ConsoleView consoleView) {
		consoleView.showGameName();
	}
}