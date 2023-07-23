package Figures;

import Game.GameBoard;

public class King extends Figure {
   public King(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol(){
        return isWhite() ? "K" : "k";
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}