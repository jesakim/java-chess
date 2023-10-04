package Pieces;

import Board.Board;
import Enums.Colors;

public class King extends Piece {

    public King( int row,int col, Colors color, Board board) {
        super( row,col, color, board);
        this.setName("king");
    }

    @Override
    public char setUniChar() {
        return 'K';
    }

    @Override
    public boolean isValidMove(int destinationCol, int destinationRow) {
        int currentCol = this.getColumn();
        int currentRow = this.getRow();

        // Check if the destination is a valid move (one square in any direction)
        int colDiff = Math.abs(destinationCol - currentCol);
        int rowDiff = Math.abs(destinationRow - currentRow);

        return (colDiff <= 1 && rowDiff <= 1 && getBoard().getPiece(destinationRow,destinationCol).getColor() != getColor());
    }
}
