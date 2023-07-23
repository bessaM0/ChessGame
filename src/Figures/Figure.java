package src.Figures;

import src.GameBoard;

public abstract class Figure {
    private boolean isWhite;

    public Figure(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite(){
        return this.isWhite;
    };

    public abstract boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard);
}
