package src.andrew.xo.model;

public class Player {
	private String name;
	private String figure;

	public Player(String name, String figure) {
		this.name = name;
		this.figure = figure;
	}

	public String getName() {
		return this.name;
	}

	public String getFigure() {
		return this.figure;
	}
}