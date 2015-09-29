package src.andrew.xo.model;

public class Figure {
	private String figure;

    public Figure() {
        this("X");
    }

    public Figure(final String figure) {
        super();
        this.figure = figure;
    }

    public void setFigure(final String figure) {
        this.figure = figure;
    }

    public String getFigure() {
		return this.figure;
	}

    @Override
    public String toString() {
        return this.figure;
    }
}