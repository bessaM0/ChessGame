package Figures;

import Game.GameBoard;

public class Bishop extends Figure {
   public Bishop(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol(){
        return isWhite() ? "B" : "b";
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}