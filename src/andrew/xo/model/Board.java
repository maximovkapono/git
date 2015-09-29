package src.andrew.xo.model;

import java.awt.Point;
import java.util.Arrays;

public class Board {

    public static final int FIGURE_SIZE = 9;
    public Figure[][] figures = new Figure[FIGURE_SIZE][FIGURE_SIZE];

    public int getFigureSize() {
        return figures.length;
    }

    public Figure getFigure(int x, int y) {
        return figures[x][y];
    }

    public void setFigure(Point point, String figure) {
        this.figures[point.x][point.y] = new Figure(figure);
    }

    //    public void showBoard() {
//        System.out.println(Arrays.deepToString(this.figures));
//    }
}