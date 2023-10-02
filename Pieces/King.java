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
}
