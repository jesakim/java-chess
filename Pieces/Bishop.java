package Pieces;

import Board.Board;
import Enums.Colors;

public class Bishop extends Piece{

    public Bishop( int row,int col, Colors color, Board board) {
        super( row,col, color, board);
        this.setName("bishop");
    }
    @Override
    public char setUniChar() {
        return 'B';
    }

    @Override
    public boolean isValidMove(int destinationCol, int destinationRow) {
        int currentCol = this.getColumn();
        int currentRow = this.getRow();


        // Check if the destination is a valid diagonal move
        int colDiff = Math.abs(destinationCol - currentCol);
        int rowDiff = Math.abs(destinationRow - currentRow);

        if (colDiff == rowDiff) {
            // Bishop moves diagonally

            // Check if there are any pieces in the diagonal path
            int colDirection = (destinationCol - currentCol) / colDiff;
            int rowDirection = (destinationRow - currentRow) / rowDiff;

            int col = currentCol + colDirection;
            int row = currentRow + rowDirection;
            while (col != destinationCol && row != destinationRow) {
                if (getBoard().getPiece( row,col).getColor() != null) {
                    return false;  // Path is blocked
                }
                col += colDirection;
                row += rowDirection;
            }

            // Check if the destination is empty or has an opponent's piece
            return  getBoard().getPiece(destinationRow, destinationCol).getColor() != this.getColor();
        }

        return false;  // Invalid move
    }

}
