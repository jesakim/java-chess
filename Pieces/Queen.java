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
}
