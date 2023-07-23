package Game;

import java.util.Scanner;

import Figures.Bishop;
import Figures.Figure;
import Figures.Knight;
import Figures.Pawn;
import Figures.Queen;
import Figures.Rook;

public class Game {
    private GameBoard gameBoard;

    public Game() {
        gameBoard = new GameBoard();
    }

    public GameBoard getGameBoard(){
        return this.gameBoard;
    }

    public void makeMove(int startX, int startY, int endX, int endY) {

        Figure figure = gameBoard.getFigure(startX, startY);
        if (figure != null && figure.isValidMove(startX, startY, endX, endY, gameBoard)) {
            gameBoard.setFigure(endX, endY, figure);
            gameBoard.setFigure(startX, startY, figure);
            figure.setHasMoved();

            // if pawn reaches baseline, player can pick a figure
            if (figure instanceof Pawn){
                if((figure.isWhite() && endY == 7) || (!figure.isWhite() && endY == 0)){
                    Figure newFigure = chooseFigure(figure.isWhite());
                    gameBoard.setFigure(endX, endY, newFigure);
                }
            }

        } else {
            System.out.println("Invalid Move");
        }
    }

    public Figure chooseFigure(boolean isWhite){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a piece (Q/R/B/N)");
        String input = sc.nextLine().toUpperCase();

        switch(input) {
            case "Q":
                return new Queen(isWhite);
            case "R":
                return new Rook(isWhite);
            case "B":
                return new Bishop(isWhite);
            case "N":
                return new Knight(isWhite);
            default :
                System.out.println("Invalid choice, defaulting to Queen.");
                return new Queen(isWhite);
        }
    }
}
