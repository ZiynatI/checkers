import java.util.Scanner;

public class GameEngine {
    public void play() {
        GameBoard board = new GameBoard(8, 8);
        Scanner inputMove = new Scanner(System.in);
        Player blackPlayer = new Black(inputMove);
        Player whitePlayer = new White(inputMove);
        boolean isWhitePlayer = true;
        System.out.println(board.toString());
        do {
            Player player = isWhitePlayer ? whitePlayer : blackPlayer;
            Pieces v = player.getValue();
            System.out.println("Choose square to move from");
            Square movingFrom = player.chooseSquare(board);
            board[movingFrom.row - 97][movingFrom.column] = Pieces.EMPTY_SQUARE;
            System.out.println("Choose square to move to");
            Square movingTo = player.chooseSquare(board);
            board[movingTo.row - 97][movingTo.column] = v;
            System.out.println(board.toString());
            isWhitePlayer = !isWhitePlayer;
            Situation situation = getSituation(board);
            if (situation != Situation.GAME_CONTINUES) {
                break;
            }
        } while (true);

    }

    public Situation getSituation(Pieces[][] board) {
        int blackPieces = 0;
        int whitePieces = 0;
        for (Pieces[] row : board) {
            for (Pieces cell : row) {
                if (cell == Pieces.BLACK) {
                    blackPieces++;
                } else if (cell == Pieces.WHITE) {
                    whitePieces++;
                }
            }
        }
        if (blackPieces == 0) {
            return Situation.WHITE_WON;
        } else if (whitePieces == 0) {
            return Situation.BLACK_WON;
        }
        return Situation.GAME_CONTINUES;
    }

    public void printBoard(Pieces[][] board) {
        System.out.println(getBoardString(board));
    }

    public String getBoardString(Pieces[][] board) {
        char numOfRow = 'a';
        StringBuilder sb = new StringBuilder();
        sb.append("\t1   2   3   4   5   6   7   8\n");
        for (Pieces[] row : board) {
            sb.append(numOfRow).append("  ");
            for (Pieces cell : row) {
                sb.append(cell).append("\t");
            }
            sb.append(numOfRow).append("\n");
            numOfRow++;
        }
        sb.append("\t1   2   3   4   5   6   7   8\n");
        return sb.toString();
    }
}
