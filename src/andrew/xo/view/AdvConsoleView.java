package src.andrew.xo.view;
import src.andrew.xo.controller.Game;

public class AdvConsoleView extends ConsoleView {
	public AdvConsoleView(Game game) {
		super(game);
	}

	@Override
	public void showGameName() {
		System.out.println("***");
		System.out.println(game.getGameName());
	}

}