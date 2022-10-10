import java.util.LinkedHashMap;
import java.util.Map;

public class GameBoard {
    public final int numOfRows;
    public final int numOfColumns;
    LinkedHashMap<Square, Pieces> squares;

    public GameBoard(int numOfRows, int numOfColumns) {
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
    }

    public LinkedHashMap<Square, Pieces> getSquares() {
        for (Map.Entry<Square, Pieces> cell : squares.entrySet()) {

        }
        return squares;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();

        return boardString.toString();
    }
}
