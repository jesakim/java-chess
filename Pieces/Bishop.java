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

}
