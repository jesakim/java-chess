import Board.Board;
import Board.BoardView;
import Enums.Colors;
import Pieces.Piece;
import Utils.ConsoleColors;

import java.util.Scanner;

public class ChessGame {

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Board board = new Board();
        BoardView boardView = new BoardView(board);
        Scanner scanner = new Scanner (System.in);

        int inGameChoice;

        boolean gameOngoing = true;
        boolean isWhiteTurn = true;


        while (gameOngoing) {
            clearConsole();
            boardView.displayBoard();
            boardView.displayKilledPieces();
            System.out.println("Turn of: " + (isWhiteTurn ? ConsoleColors.BRIGHT_WHITE+ConsoleColors.BG_WHITE +" White Player " :ConsoleColors.BRIGHT_BLACK+ConsoleColors.BG_BLACK +" Black Player " ) + ConsoleColors.RESET);
            System.out.println("Choose option:");
            System.out.println("1. Move Piece");
            System.out.println("2. Surrender");
            System.out.print("Enter Your Choice: ");
            while (!scanner.hasNextInt()){
                System.out.print("Enter Your Choice [1 or 2 ]: ");
                scanner.nextLine();
            }
            inGameChoice = scanner.nextInt();
            scanner.nextLine();
            switch (inGameChoice){

                case 1 :
                    boolean moveSuccessful = false;
                    while (!moveSuccessful) {
                        try {
                            System.out.print("Pick a piece to move (example E4): ");
                            String inputChoosePiece = scanner.nextLine();
                            char startCharacter = inputChoosePiece.charAt(0);
                            char startNumber = inputChoosePiece.charAt(1);

                            int startingCol = PlayerInput.returnCol(startCharacter);
                            int startingRow = PlayerInput.returnRow(startNumber);

                            Piece piece = board.getPiece(startingRow,startingCol);

                            if( (isWhiteTurn && piece.getColor() == Colors.w) || (!isWhiteTurn && piece.getColor() == Colors.b ) ) {

                                System.out.print("Select The Distination (example E2): ");

                                String inputDestination = scanner.nextLine();

                                char destCharacter = inputDestination.charAt(0);
                                char destNumber = inputDestination.charAt(1);

                                int destRow = PlayerInput.returnRow(destNumber);
                                int destCol = PlayerInput.returnCol(destCharacter);

                                Piece distination = board.getPiece(destRow,destCol);

                                if ( (isWhiteTurn && distination.getColor() != Colors.w) || (!isWhiteTurn && distination.getColor() != Colors.b )){
                                    board.movePiece(piece,distination);
                                    moveSuccessful = true;
                                    isWhiteTurn = !isWhiteTurn;
                                }else{
                                    System.out.println("You Cant Move The Selected Piece Here");
                                }

                            }else{
                                System.out.println("The Selected Piece Not Yours");
                            }


                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Piece Or Distination Not Found");
                        }
                    }
                    break;
                case 2:
                    System.out.println("The " + (isWhiteTurn ? "White" : "Black")
                            + "Player Gave up. End of the game...");
                    gameOngoing = false;
                    break;
                default :
                    System.out.println("Enter A Valid Choice [1 or 2 ]: ");

            }

        }
    }
}
