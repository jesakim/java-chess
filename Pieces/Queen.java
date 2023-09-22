package Pieces;

import Enums.Colors;

public class Queen extends Piece {

    public Queen( int row,int col, Colors color) {
        super( row,col, color);
        this.setName("gueen");
    }

    @Override
    public char setUniChar() {
        return 'Q' ;
    }
}
