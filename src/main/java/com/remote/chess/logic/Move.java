package com.remote.chess.logic;

public class Move {
    private final int sourceCol;
    private final int sourceRow;
    private final int destCol;
    private final int destRow;

    public Move(int sourceCol, int sourceRow, int destCol, int destRow) {
        this.sourceCol = sourceCol;
        this.sourceRow = sourceRow;
        this.destCol = destCol;
        this.destRow = destRow;
    }

    public int getSourceCol() {
        return sourceCol;
    }

    public int getSourceRow() {
        return sourceRow;
    }

    public int getDestCol() {
        return destCol;
    }

    public int getDestRow() {
        return destRow;
    }
}
