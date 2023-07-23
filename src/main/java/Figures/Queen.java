package Figures;

import Game.GameBoard;

public class Queen extends Figure {
   public Queen(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol(){
        return isWhite() ? "Q" : "q";
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}