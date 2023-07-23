package src.Figures;

import src.Game.GameBoard;

public abstract class Figure {
    private boolean isWhite;

    private boolean hasMoved = false;

    public Figure(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean hasMoved() {
        return this.hasMoved;
    }

    public void setHasMoved() {
        hasMoved = true;
    }

    public boolean isWhite() {
        return this.isWhite;
    };

    public abstract boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard);
}
