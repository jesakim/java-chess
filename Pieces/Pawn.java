package Pieces;

import Enums.Colors;

public class Pawn extends Piece{

    public Pawn( int row,int col, Colors color) {
        super( row,col, color);
        this.setName("pawn");
    }

    @Override
    public char setUniChar() {
        return 'P';
    }
}
