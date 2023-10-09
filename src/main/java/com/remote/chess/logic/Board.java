package com.remote.chess.logic;

import com.remote.chess.logic.figures.None;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<BoardRow> rows = new ArrayList<>();


    public Board() {
        for (int row = 0; row < 8; row++)
            rows.add(new BoardRow());
    }

    public Figure getFigure(int col, int row) {
        return rows.get(row).getCols().get(col);
    }

    public void setFigure(int col, int row, Figure figure) {
        rows.get(row).getCols().set(col, figure);
    }

    public void move(Move move) {
        Figure figure = getFigure(move.getSourceCol(), move.getSourceRow());
        setFigure(move.getSourceCol(), move.getDestRow(), figure);
        setFigure(move.getSourceCol(), move.getDestRow(), new None());
    }


    @Override
    public String toString() {
        String s = "|--|--|--|--|--|--|--|--|\n";
        for (int row = 0; row < 8; row++)
            s += rows.get(row).toString();
        s += "|--|--|--|--|--|--|--|--|\n";
        return s;
    }
}

