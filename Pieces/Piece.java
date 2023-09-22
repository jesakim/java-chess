package Pieces;

import Enums.Colors;

public class Piece {
    private String name;
    private final char uniChar;
    private int column;
    private int row;
    private final Colors color;
    private boolean isDead;

    public Piece( int row,int col, Colors color) {
        this.column = col;
        this.row = row;
        this.color = color;
        this.uniChar = setUniChar();
    }


    public char setUniChar() {
        return ' ';
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }


    public void setName(String name) {
        this.name = name;
    }
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    public boolean isDead() {
        return isDead;
    }
    public char getUniChar() {
        return uniChar;
    }

    public Colors getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void move(int desCol, int desRow) {
        setColumn(desCol);
        setRow(desRow);
    }


    public String toString() {
        return "Pieces.Piece{" +
                "name='" + name + '\'' +
                ", unicode=" + uniChar +
                ", column=" + column +
                ", row=" + row +
                ", color=" + color +
                ", isdead=" + isDead +
                '}';
    }

}
