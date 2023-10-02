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

//    public boolean isValidMove(int destinationCol, int destinationRow) {
//        int currentCol = this.getCol();
//        int currentRow = this.getRow();
//
//        // Check if the destination is within the bounds of the board
//        if (destinationCol < 0 || destinationCol >= 8 || destinationRow < 0 || destinationRow >= 8) {
//            return false;
//        }
//
//        // Check if the destination is a valid forward move
//        if (this.getColor() == Colors.WHITE) {
//            // White pawns move upwards (decreasing row numbers)
//            if (destinationRow == currentRow - 1 && destinationCol == currentCol &&
//                    Board.getPiece(destinationCol, destinationRow) == null) {
//                return true;  // Move one square forward
//            }
//            if (destinationRow == currentRow - 1 &&
//                    Math.abs(destinationCol - currentCol) == 1 &&
//                    Board.getPiece(destinationCol, destinationRow) != null &&
//                    Board.getPiece(destinationCol, destinationRow).getColor() == Colors.BLACK) {
//                return true;  // Capture diagonally
//            }
//        } else {
//            // Black pawns move downwards (increasing row numbers)
//            if (destinationRow == currentRow + 1 && destinationCol == currentCol &&
//                    Board.getPiece(destinationCol, destinationRow) == null) {
//                return true;  // Move one square forward
//            }
//            if (destinationRow == currentRow + 1 &&
//                    Math.abs(destinationCol - currentCol) == 1 &&
//                    Board.getPiece(destinationCol, destinationRow) != null &&
//                    Board.getPiece(destinationCol, destinationRow).getColor() == Colors.WHITE) {
//                return true;  // Capture diagonally
//            }
//        }
//
//        return false;  // Invalid move
//    }

}
