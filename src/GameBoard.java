package src;

import src.Figures.Figure;
import src.Figures.Rook;
import src.Figures.Queen;
import src.Figures.Bishop;
import src.Figures.King;
import src.Figures.Knight;
import src.Figures.Pawn;

public class GameBoard {
    private Figure[][] gameField;

    public GameBoard() {
        gameField = new Figure[8][8];

        // Initialize white figures
        gameField[0][0] = new Rook(true);
        gameField[0][1] = new Knight(true);
        gameField[0][2] = new Bishop(true);
        gameField[0][3] = new Queen(true);
        gameField[0][4] = new King(true);
        gameField[0][5] = new Bishop(true);
        gameField[0][6] = new Knight(true);
        gameField[0][7] = new Rook(true);

        for (int i = 0; i < 8; i++) {
            gameField[1][i] = new Pawn(true);
        }

        // Initialize black figures
        gameField[7][0] = new Rook(false);
        gameField[7][1] = new Knight(false);
        gameField[7][2] = new Bishop(false);
        gameField[7][3] = new Queen(false);
        gameField[7][4] = new King(false);
        gameField[7][5] = new Bishop(false);
        gameField[7][6] = new Knight(false);
        gameField[7][7] = new Rook(false);

        for (int i = 0; i < 8; i++) {
            gameField[6][i] = new Pawn(false);
        }
    }

    public Figure getFigure(int x , int y){
        return this.gameField[x][y];
    }
}