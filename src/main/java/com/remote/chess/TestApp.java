package com.remote.chess;

import com.remote.chess.logic.Board;
import com.remote.chess.logic.FigureColor;
import com.remote.chess.logic.Move;
import com.remote.chess.logic.figures.Pawn;
import com.remote.chess.logic.figures.Rock;

public class TestApp {
    public static void main(String[] args) {
        Board board = new Board();
        board.setFigure(0, 0, new Rock(FigureColor.BLACK));
        board.setFigure(0, 6, new Pawn(FigureColor.WHITE));
        System.out.println(board);
        board.move(new Move(0, 6, 0, 5));
        System.out.println(board);
    }
}
