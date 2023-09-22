package Board;

import Enums.Colors;
import Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Piece[][] board;
    private List<Character> killedWhitePieaces = new ArrayList<>();
    private List<Character> killedBlackPieaces = new ArrayList<>();

    public List<Character> getKilledWhitePieaces() {
        return killedWhitePieaces;
    }

    public List<Character> getKilledBlackPieaces() {
        return killedBlackPieaces;
    }



    public Board() {
        // Initialize the chessboard with starting positions of pieces
        initializeBoard();
    }

    private void initializeBoard() {
        // Create an 8x8 chessboard and initialize with empty squares
        board = new Piece[8][8];

        // Initialize pawns for both players
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(1,i, Colors.b); // White pawns
            board[6][i] = new Pawn(6,i, Colors.w);; // Black pawns
        }

        // Initialize other pieces for white
        board[0][0] = new Rook(0, 0, Colors.b);
        board[0][1] = new Knight(0,1,Colors.b);
        board[0][2] = new Bishop(0,2,Colors.b);
        board[0][3] = new Queen(0,3,Colors.b);
        board[0][4] = new King(0,4,Colors.b);
        board[0][5] = new Bishop(0,5,Colors.b);
        board[0][6] = new Knight(0,6,Colors.b);
        board[0][7] = new Rook(0, 7, Colors.b);

        // Initialize other pieces for black
        board[7][0] = new Rook(7, 0, Colors.w);
        board[7][1] = new Knight(7, 1, Colors.w);
        board[7][2] = new Bishop(7, 2, Colors.w);
        board[7][3] = new Queen(7, 3, Colors.w);
        board[7][4] = new King(7, 4, Colors.w);
        board[7][5] = new Bishop(7, 5, Colors.w);
        board[7][6] = new Knight(7, 6, Colors.w);
        board[7][7] = new Rook(7, 7, Colors.w);

        // Initialize empty squares
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Piece(i,j,null);
            }
        }


    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void movePiece(Piece piece,Piece destination){
        int pieceRow = piece.getRow();
        int pieceColumn = piece.getColumn();
        int destinationRow = destination.getRow();
        int destinationColumn = destination.getColumn();
        if (destination.getName() != null){
            if (destination.getColor() == Colors.b){
                killedBlackPieaces.add(destination.getUniChar());
            }else {
                killedWhitePieaces.add(destination.getUniChar());
            }
            destination = null;
            board[pieceRow][pieceColumn] = new Piece(pieceRow,pieceColumn,null);
        }else{
            board[pieceRow][pieceColumn] = destination;
        }


        board[destinationRow][destinationColumn] = piece;

        piece.setRow(destinationRow);
        piece.setColumn(destinationColumn);
        if (destination != null){
            destination.setRow(pieceRow);
            destination.setColumn(pieceColumn);
        }

    }

}
