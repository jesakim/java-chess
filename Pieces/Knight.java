package Pieces;

import Enums.Colors;

public class Knight extends  Piece{

    public Knight( int row,int col, Colors color) {
        super( row,col, color);
        this.setName("knight");
    }

    @Override
    public char setUniChar() {
        return 'N';
    }
}
