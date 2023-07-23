package src.Figures;

import src.GameBoard;

public class Knight extends Figure {
   public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}