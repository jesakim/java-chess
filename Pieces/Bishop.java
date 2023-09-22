package Pieces;

import Enums.Colors;

public class Bishop extends Piece{

    public Bishop( int row,int col, Colors color) {
        super( row,col, color);
        this.setName("bishop");
    }
    @Override
    public char setUniChar() {
        return 'B';
    }

}
