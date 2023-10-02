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
}
