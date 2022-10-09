import java.util.LinkedHashMap;

public class GameBoard {
    public final int numOfRows;
    public final int numOfColumns;
    int size;
    LinkedHashMap<Square, Value> squares;

    public GameBoard(int numOfRows, int numOfColumns) {
        this.numOfRows = numOfRows;
        this.numOfColumns = numOfColumns;
    }

    public int getSize() {
        this.size=numOfRows * numOfColumns;
        return size;
    }
}
