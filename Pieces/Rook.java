package Pieces;

import Enums.Colors;

public class Rook extends Piece{

    public Rook( int row,int col, Colors color) {
        super( row,col, color);
        this.setName("rook");
    }

    @Override
    public char setUniChar() {
        return 'R';
    }
}
