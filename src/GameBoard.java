import java.util.LinkedList;

public class GameBoard {
    SituationOfSquare[][] board;

    GameBoard() {
        this.board = getNewSquares();
    }

    public SituationOfSquare[][] getBoard() {
        return board;
    }

    public void put(Square square, SituationOfSquare playersValue) {
        board[square.row][square.column] = playersValue;
    }

    private SituationOfSquare[][] getNewSquares() {
        SituationOfSquare[][] startBoard = new SituationOfSquare[8][8];
        LinkedList<SituationOfSquare> squares = new LinkedList<>();
        boolean isBlack;
        SituationOfSquare thisSituation;
        for (int i = 0; i < 8; i++) {
            isBlack = i % 2 != 0;
            if (i < 3) {
                thisSituation = SituationOfSquare.BLACK_PIECE;
            } else if (i < 5) {
                thisSituation = SituationOfSquare.EMPTY_SQUARE;
            } else {
                thisSituation = SituationOfSquare.WHITE_PIECE;
            }
            for (char j = 'a'; j < 'i'; j++) {
                startBoard[i][j - 97] = isBlack ? thisSituation : SituationOfSquare.WHITE_SQUARE;
                squares.add(isBlack ? thisSituation : SituationOfSquare.EMPTY_SQUARE);
                isBlack = !isBlack;
            }
        }
        return startBoard;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();
        int numOfSquares = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boardString.append(board[i][j] != SituationOfSquare.WHITE_SQUARE ? "|" + board[i][j] + "|" : "▓▓");
                numOfSquares++;
                if (numOfSquares % 8 == 0) {
                    boardString.append("\n");
                }
            }
        }
        return boardString.toString();
    }


    public String getBoardString() {
        int numOfRow = 8;
        StringBuilder sb = new StringBuilder();
        sb.append("\ta   b   c   d   e   f   g   h\n");
        for (SituationOfSquare[] row : board) {
            sb.append(numOfRow).append("  ");
            for (SituationOfSquare cell : row) {
                sb.append(cell).append("\t");
            }
            sb.append(numOfRow).append("\n");
            numOfRow--;
        }
        sb.append("\ta   b   c   d   e   f   g   h\n");
        return sb.toString();
    }
}
