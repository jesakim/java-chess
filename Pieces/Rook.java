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
}
