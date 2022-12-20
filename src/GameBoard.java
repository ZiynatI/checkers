import java.util.LinkedHashMap;
import java.util.Map;

public class GameBoard {
   public LinkedHashMap<Square, SituationOfSquare> squares;

    GameBoard() {
        this.squares = getNewSquares();
    }

    private LinkedHashMap<Square, SituationOfSquare> getNewSquares() {
        LinkedHashMap<Square, SituationOfSquare> squares = new LinkedHashMap<>();
        boolean isBlack;
        SituationOfSquare thisSituation;
        for (int i = 8; i > 0; i--) {
            isBlack = i % 2 != 0;
            if (i >= 6) {
                thisSituation = SituationOfSquare.BLACK;
            } else if (i > 3) {
                thisSituation = SituationOfSquare.EMPTY_SQUARE;
            } else {
                thisSituation = SituationOfSquare.WHITE;
            }
            for (char j = 'a'; j < 'i'; j++) {
                squares.put(new Square(j, i, isBlack), isBlack ? thisSituation : SituationOfSquare.EMPTY_SQUARE);
                isBlack = !isBlack;
            }
        }
        return squares;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();
        int numOfSquares = 0;
        for (Map.Entry<Square, SituationOfSquare> cell : squares.entrySet()) {
            boardString.append(cell.getKey().isBlack ? "|" + cell.getValue() + "|" : "▓▓");
            numOfSquares++;
            if (numOfSquares % 8 == 0) {
                boardString.append("\n");
            }
        }
        return boardString.toString();
    }
}
