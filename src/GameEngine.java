import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        //        System.out.println(getBoardString(board.board));
    }

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
            if (!player.takePiece(board).equals(null)) {

            } else {
                System.out.println("Choose square to move from");
                Square movingFrom = player.chooseSquare(board);
                board.put(movingFrom, player.getValue());
                System.out.println("Choose square to move to");
                Square movingTo = player.chooseSquare(board);
                board.put(movingTo, player.getValue());
            }
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
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] == SituationOfSquare.BLACK_PIECE) {
                    blackPieces++;
                } else if (board.board[i][j] == SituationOfSquare.WHITE_PIECE) {
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

    //    public void printBoard(SituationOfSquare[][] board) {
    //        System.out.println(getBoardString(board));
    //    }


}
