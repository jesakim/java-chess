package Board;

import Enums.Colors;
import Pieces.Piece;
import Utils.ConsoleColors;

public class BoardView {

    private Board board;

    public BoardView(Board board){
        this.board = board;
    }
    public void displayBoard() {
        System.out.println("   a  b  c  d  e  f  g  h");

        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " " );
            for (int j = 0; j < 8; j++) {
                Piece piece = board.getPiece(i,j);
                System.out.print( ((i + j) % 2 != 0 ? ConsoleColors.BG_DARK_SQUARE : ConsoleColors.BG_WHITE )+(piece.getColor() == Colors.w ? ConsoleColors.BRIGHT_WHITE : ConsoleColors.BLACK) +' '+ piece.getUniChar()+' ' +ConsoleColors.RESET);
            }
            System.out.println(" " + (8 - i));
        }
        System.out.println("   a  b  c  d  e  f  g  h");
    }

    public void displayKilledPieces(){
        System.out.print("Killed White Pieces: ");
        board.getKilledWhitePieaces().stream().forEach(System.out::print);
        System.out.println();
        System.out.print("Killed Black Pieces: ");
        board.getKilledBlackPieaces().stream().forEach(System.out::print);
        System.out.println();
    }
}
