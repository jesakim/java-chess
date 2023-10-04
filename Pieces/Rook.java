package Pieces;

import Board.Board;
import Enums.Colors;

public class Rook extends Piece{

    public Rook( int row,int col, Colors color, Board board) {
        super( row,col, color, board);
        this.setName("rook");
    }

    @Override
    public char setUniChar() {
        return 'R';
    }

    @Override
    public boolean isValidMove(int destinationCol, int destinationRow) {
        int currentCol = this.getColumn();
        int currentRow = this.getRow();

        int colDiff = Math.abs(destinationCol - currentCol);
        int rowDiff = Math.abs(destinationRow - currentRow);

        // Check if the move is horizontal or vertical
        boolean isHorizontal = (colDiff > 0 && rowDiff == 0);
        boolean isVertical = (colDiff == 0 && rowDiff > 0);

        // Check if the path is clear for horizontal or vertical moves
        if (isHorizontal) {
            int startCol = Math.min(currentCol, destinationCol) + 1;
            int endCol = Math.max(currentCol, destinationCol);

            for (int i = startCol; i < endCol; i++) {
                if (getBoard().getPiece(currentRow,i ).getColor() != null) {
                    return false;  // Path is blocked
                }
            }
        } else if (isVertical) {
            int startRow = Math.min(currentRow, destinationRow) + 1;
            int endRow = Math.max(currentRow, destinationRow);

            for (int i = startRow; i < endRow; i++) {
                if (getBoard().getPiece(i,currentCol).getColor() != null) {
                    return false;  // Path is blocked
                }
            }
        }

        // Check if the destination is not occupied by a piece of the same color
        if (getBoard().getPiece(destinationRow,destinationCol ).getColor() == this.getColor()) {
            return false;
        }

        return isHorizontal || isVertical;
    }
}
