package Pieces;

import Board.Board;
import Enums.Colors;

public class Knight extends  Piece{

    public Knight( int row,int col, Colors color, Board board) {
        super( row,col, color, board);
        this.setName("knight");
    }

    @Override
    public char setUniChar() {
        return 'N';
    }

    @Override
    public boolean isValidMove(int destinationCol, int destinationRow) {
        int currentCol = this.getColumn();
        int currentRow = this.getRow();

        int colDiff = Math.abs(destinationCol - currentCol);
        int rowDiff = Math.abs(destinationRow - currentRow);

        // Check if the move is an L-shape (two squares in one direction and one in the perpendicular direction)
        boolean isLShape = (colDiff == 1 && rowDiff == 2) || (colDiff == 2 && rowDiff == 1);

        return isLShape && getBoard().getPiece(destinationRow,destinationCol).getColor() != getColor();
    }
}
