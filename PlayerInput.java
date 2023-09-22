import static java.lang.Character.toUpperCase;


public class PlayerInput {

    static int returnRow(char number) {
        int row;
        switch (number) {
            case '1' -> row = 7;
            case '2' -> row = 6;
            case '3' -> row = 5;
            case '4' -> row = 4;
            case '5' -> row = 3;
            case '6' -> row = 2;
            case '7' -> row = 1;
            case '8' -> row = 0;
            default -> row = 10;
        }
        return row;
    }

    static int returnCol(char character) {
        int col;
        switch (toUpperCase(character)) {
            case 'A' -> col = 0;
            case 'B' -> col = 1;
            case 'C' -> col = 2;
            case 'D' -> col = 3;
            case 'E' -> col = 4;
            case 'F' -> col = 5;
            case 'G' -> col = 6;
            case 'H' -> col = 7;
            default -> col = 10;
        }
        return col;
    }
}