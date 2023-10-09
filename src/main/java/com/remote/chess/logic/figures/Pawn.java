package com.remote.chess.logic.figures;

import com.remote.chess.logic.Figure;
import com.remote.chess.logic.FigureColor;
import com.remote.chess.logic.FigureMove;

import java.util.List;

public class Pawn implements Figure {

    private final FigureColor color;

    public Pawn(FigureColor color) {
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
        return getColorSymbol() + "P";
    }

    private String getColorSymbol() {
        return (color == FigureColor.WHITE) ? "w" : "b";
    }
}
