package Figures;

import Game.GameBoard;

public class Pawn extends Figure {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol(){
        return isWhite() ? "P" : "p";
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard) {
        // Pawn can go one point up for white, and one point down for black
        // Pawn can attack diagonal if there is a figure and has different color

        if (this.isWhite()) {
            if (!this.hasMoved() && startY == 1 && endY == startY + 2 && gameBoard.getFigure(endX, endY) == null
                    && startX == endX) {
                // Double move forward for white pawn on its initial position
                return true;
            }
            int checkValue = startY + 1;
            if (checkValue == endY && gameBoard.getFigure(endX, endY) == null && startX == endX) {
                // Regular move forward
                return true;
            } else if (checkValue == endY && Math.abs(startX - endX) == 1 && gameBoard.getFigure(endX, endY) != null
                    && !gameBoard.getFigure(endX, endY).isWhite()) {
                // Diagonal capture
                return true;
            }
        } else {
            if (!this.hasMoved() && startY == 6 && endY == startY - 2 && gameBoard.getFigure(endX, endY) == null
                    && startX == endX) {
                // Double move forward for black pawn on its initial position
                return true;
            }
            int checkValue = startY - 1;
            if (checkValue == endY && gameBoard.getFigure(endX, endY) == null && startX == endX) {
                // Regular move forward
                return true;
            } else if (checkValue == endY && Math.abs(startX - endX) == 1 && gameBoard.getFigure(endX, endY) != null
                    && gameBoard.getFigure(endX, endY).isWhite()) {
                // Diagonal capture
                return true;
            }
        }
        return false;
    }

}
