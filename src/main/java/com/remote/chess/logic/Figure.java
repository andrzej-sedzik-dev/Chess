package com.remote.chess.logic;

import java.util.List;

public interface Figure {
    FigureColor getColor();
    List<FigureMove> getPossibleMoves();



}
