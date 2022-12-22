import java.util.HashMap;
import java.util.Map;

public class Square {
    public final int row;
    public final char column;


    public Square(char column, int row) {
        this.column = column;
        this.row = row;

    }

    public Map<Square, Square[]> positionsToCheck() {
        Map<Square, Square[]> map = new HashMap<>();
        map.put(new Square('b', 8), new Square[]{new Square('c', 7)});
        map.put(new Square('d', 8), new Square[]{new Square('c', 7), new Square('e', 7)});
        map.put(new Square('f', 8), new Square[]{new Square('e', 7), new Square('g', 7)});
        map.put(new Square('h', 8), new Square[]{new Square('g', 7)});
        map.put(new Square('a',7),new Square[]{new Square('b',6)});
        map.put(new Square('c',7),new Square[]{new Square('d',6),new Square('c',6)});
        map.put(new Square('e',7),new Square[]{new Square('d',6),new Square('f',6)});
        map.put(new Square('g',7),new Square[]{new Square()})
    }
}
