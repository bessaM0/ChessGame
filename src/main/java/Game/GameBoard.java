package Game;

import Figures.Bishop;
import Figures.Figure;
import Figures.King;
import Figures.Knight;
import Figures.Pawn;
import Figures.Queen;
import Figures.Rook;

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

    public void setFigure(int x, int y, Figure figure){
        gameField[x][y] = figure;
    }

    public void display() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (gameField[i][j] != null) {
                    System.out.print(gameField[i][j].getSymbol());
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }


    
}