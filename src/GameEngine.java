import java.util.Map;
import java.util.Scanner;

public class GameEngine {
    public void play() {
        GameBoard board = new GameBoard();
        Scanner inputMove = new Scanner(System.in);
        Player blackPlayer = new Black(inputMove);
        Player whitePlayer = new White(inputMove);
        boolean isWhitePlayer = true;
        System.out.println(board);
        do {
            Player player = isWhitePlayer ? whitePlayer : blackPlayer;
            SituationOfSquare v = player.getValue();
            System.out.println("Choose square to move from");
            Square movingFrom = player.chooseSquare(board);
            board.squares.put(movingFrom,SituationOfSquare.EMPTY_SQUARE);
//            board[movingFrom.row - 97][movingFrom.column] = SituationOfSquare.EMPTY_SQUARE;
            System.out.println("Choose square to move to");
            Square movingTo = player.chooseSquare(board);
            board.squares.put(movingTo,v);
//            [movingTo.row - 97][movingTo.column] = v;
            System.out.println(board);
            isWhitePlayer = !isWhitePlayer;
            Situation situation = getSituation(board);
            if (situation != Situation.GAME_CONTINUES) {
                break;
            }
        } while (true);

    }

    public Situation getSituation(GameBoard board) {
        int blackPieces = 0;
        int whitePieces = 0;
        for (Map.Entry<Square, SituationOfSquare> cell :board.squares.entrySet()) {
                if (cell.getValue() == SituationOfSquare.BLACK) {
                    blackPieces++;
                } else if (cell.getValue() == SituationOfSquare.WHITE) {
                    whitePieces++;

            }
        }
        if (blackPieces == 0) {
            return Situation.WHITE_WON;
        } else if (whitePieces == 0) {
            return Situation.BLACK_WON;
        }
        return Situation.GAME_CONTINUES;
    }

    public void printBoard(SituationOfSquare[][] board) {
        System.out.println(getBoardString(board));
    }

    public String getBoardString(SituationOfSquare[][] board) {
        char numOfRow = 'a';
        StringBuilder sb = new StringBuilder();
        sb.append("\t1   2   3   4   5   6   7   8\n");
        for (SituationOfSquare[] row : board) {
            sb.append(numOfRow).append("  ");
            for (SituationOfSquare cell : row) {
                sb.append(cell).append("\t");
            }
            sb.append(numOfRow).append("\n");
            numOfRow++;
        }
        sb.append("\t1   2   3   4   5   6   7   8\n");
        return sb.toString();
    }
}
