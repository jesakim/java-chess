package Pieces;

import Enums.Colors;

public class King extends Piece {

    public King( int row,int col, Colors color) {
        super( row,col, color);
        this.setName("king");
    }

    @Override
    public char setUniChar() {
        return 'K';
    }
}
