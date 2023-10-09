package com.remote.chess.logic.figures;

import com.remote.chess.logic.Figure;
import com.remote.chess.logic.FigureColor;
import com.remote.chess.logic.FigureMove;

import java.util.List;

public class None implements Figure {
    @Override
    public FigureColor getColor() {
        return FigureColor.NONE;
    }

    @Override
    public List<FigureMove> getPossibleMoves() {
        return null;
    }


    @Override
    public String toString() {
        return "  ";
    }
}
