package src.Figures;

import src.Game.GameBoard;

public class Queen extends Figure {
   public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, GameBoard gameBoard){
        //do something
        return true;
    }
}