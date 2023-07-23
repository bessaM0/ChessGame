package src.Figures;

import src.GameBoard;

public class Pawn extends Figure {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard) {
        // do something
        // Pawn can go one point up for white, and one point down for black
        // Pawn can attack diagonal if there is a figure and has different color
        // we have to differentiate between white and black

        if (this.isWhite()) {
            int checkValue = startY + 1;
            if (checkValue == endY && gameBoard.getFigure(endX, endY) == null) {
                return true;
            }
        } else {
            int checkValue = startY - 1;
            if (checkValue == endY && gameBoard.getFigure(endX, endY) == null) {
                return true;
            }

        }
        return false;
    }
}