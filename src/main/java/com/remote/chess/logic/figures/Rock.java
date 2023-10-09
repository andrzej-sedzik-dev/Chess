package com.remote.chess.logic.figures;

import com.remote.chess.logic.Figure;
import com.remote.chess.logic.FigureColor;
import com.remote.chess.logic.FigureMove;

import java.util.List;

public class Rock implements Figure {

    private final FigureColor color;

    public Rock(FigureColor color) {
        this.color = color;
    }


    @Override
    public FigureColor getColor() {
        return color;
    }

    @Override
    public List<FigureMove> getPossibleMoves() {
        return null;
    }



    @Override
    public String toString() {
        return getColorSymbol() + "R";
    }

    private String getColorSymbol() {
        return (color == FigureColor.WHITE) ? "w" : "b";
    }
}
