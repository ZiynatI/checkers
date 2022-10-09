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

    public Situation getSituation(Value[][] board) {

        return Situation.GAME_CONTINUES;
    }

    public void printBoard(Value[][] board) {
        System.out.println(getBoardString(board));
    }

    public String getBoardString(Value[][] board) {
        char numOfRow = 'a';
        StringBuilder sb = new StringBuilder();
        sb.append("\t1   2   3   4   5   6   7   8\n");
        for (Value[] row : board) {
            sb.append(numOfRow).append("  ");
            for (Value cell : row) {
                sb.append(cell).append("\t");
            }
            sb.append(numOfRow).append("\n");
            numOfRow++;
        }
        sb.append("\t1   2   3   4   5   6   7   8\n");
        return sb.toString();
    }
}
