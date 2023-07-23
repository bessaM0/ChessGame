package src.main.java.Figures;

import src.main.java.Game.GameBoard;

public class Rook extends Figure {
   public Rook(boolean isWhite) {
        super(isWhite);
    }

    public String getSymbol(){
        return isWhite() ? "R" : "r";
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}
