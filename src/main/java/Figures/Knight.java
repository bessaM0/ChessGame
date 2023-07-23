package src.main.java.Figures;

import src.main.java.Game.GameBoard;

public class Knight extends Figure {
   public Knight(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol(){
        return isWhite() ? "N" : "n";
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}