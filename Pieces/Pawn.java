package Pieces;

import Board.Board;
import Enums.Colors;

public class Pawn extends Piece{

    public Pawn(int row, int col, Colors color, Board board) {
        super( row,col, color,board);
        this.setName("pawn");
    }

    @Override
    public char setUniChar() {
        return 'P';
    }


    @Override
    public boolean isValidMove(int destinationCol, int destinationRow) {
        int currentCol = this.getColumn();
        int currentRow = this.getRow();
        Piece destination = getBoard().getPiece(destinationRow, destinationCol);

        // Check if the destination is a valid forward move
        if (this.getColor() == Colors.w) {
            // White pawns move upwards (decreasing row numbers)
            if (destinationRow == currentRow - 1 &&
                    destinationCol == currentCol &&
                    destination.getColor() == null) {
                return true;  // Move one square forward
            }
            if (destinationRow == currentRow - 1 &&
                    Math.abs(destinationCol - currentCol) == 1 &&
                    destination.getColor() == Colors.b) {
                return true;  // Capture diagonally
            }
            if (currentRow == 6 && destinationRow == 4 && destinationCol == currentCol &&
                    destination.getColor() == null) {
                return true;  // Move two squares forward on the first move
            }
        } else {
            // Black pawns move downwards (increasing row numbers)
            if (destinationRow == currentRow + 1 && destinationCol == currentCol &&
                    destination.getColor() == null) {
                return true;  // Move one square forward
            }
            if (destinationRow == currentRow + 1 &&
                    Math.abs(destinationCol - currentCol) == 1 &&
                    destination.getColor() == Colors.w) {
                return true;  // Capture diagonally
            }
            if (currentRow == 1 && destinationRow == 3 && destinationCol == currentCol &&
                    destination.getColor() == null) {
                return true;  // Move two squares forward on the first move
            }
        }
        return false;  // Invalid move
    }

}
