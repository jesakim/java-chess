package Pieces;

import Board.Board;
import Enums.Colors;

public class Queen extends Piece {

    public Queen( int row,int col, Colors color, Board board) {
        super( row,col, color, board);
        this.setName("gueen");
    }

    @Override
    public char setUniChar() {
        return 'Q' ;
    }

    @Override
    public boolean isValidMove(int destinationCol, int destinationRow) {
        int currentCol = this.getColumn();
        int currentRow = this.getRow();

        Piece bichop = new Bishop(currentRow,currentCol,getColor(),getBoard());
        Piece rook = new Rook(currentRow,currentCol,getColor(),getBoard());

        return bichop.isValidMove(destinationCol,destinationRow) || rook.isValidMove(destinationCol,destinationRow);
    }
}
