import java.util.Scanner;

public class GameEngine {
    public void play() {
        Value[][] board = {
                {Value.WHITE, Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE},
                {Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE, Value.BLACK},
                {Value.WHITE, Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE},
                {Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE, Value.BLACK},
                {Value.WHITE, Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE},
                {Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE, Value.BLACK},
                {Value.WHITE, Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE},
                {Value.LIGHT_SQUARE, Value.WHITE, Value.LIGHT_SQUARE, Value.EMPTY_SQUARE, Value.LIGHT_SQUARE, Value.BLACK, Value.LIGHT_SQUARE, Value.BLACK}};

        Scanner inputMove = new Scanner(System.in);
        Player blackPlayer = new Black();
        Player whitePlayer = new White();
        printBoard(board);
        do {

        } while (true);

    }

    public Situation getSituation() {
        return Situation.GAME_CONTINUES;
    }

    public void printBoard(Value[][] board) {
        System.out.println(getBoardString(board));
    }

    public String getBoardString(Value[][] board) {
        StringBuilder sb = new StringBuilder();
        for (Value[] row : board) {
            for (Value cell : row) {
                sb.append(cell).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
