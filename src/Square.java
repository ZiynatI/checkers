import java.util.HashMap;
import java.util.Map;

public class Square {
    public final char column;
    public final int row;



    public Square(char column, int row) {
        this.column = column;
        this.row = row;

    }

//    public Map<Square, Pair<Square, Square>[]> positionsToCheck() {
//        Map<Square, Pair<Square, Square>[]> map = new HashMap<>();
//        map.put(new Square('b', 8), new Pair[]{new Pair<>(new Square('c', 7), new Square('d', 6))});
//        map.put(new Square('d', 8), new Pair[]{new Pair<>(new Square('c', 7), new Square('b', 6)), new Pair<>(new Square('e', 7), new Square('f', 6))});
//        map.put(new Square('f', 8), new Pair[]{new Pair<>(new Square('e', 7), new Square('d', 6)), new Pair<>(new Square('g', 7), new Square('h', 6))});
//        map.put(new Square('h', 8), new Pair[]{new Pair<>(new Square('g', 7), new Square('f', 6))});
//        map.put(new Square('a', 7), new Pair[]{new Pair<>(new Square('b', 6), new Square('c', 5))});
//        map.put(new Square('c', 7), new Pair[]{new Pair<>(new Square('b', 6), new Square('a', 5)), new Pair<>(new Square('d', 6), new Square('e', 5))});
//        map.put(new Square('e', 7), new Pair[]{new Pair<>(new Square('d', 6), new Square('c', 5)), new Pair<>(new Square('f', 6), new Square('g', 5))});
//        map.put(new Square('g', 7), new Pair[]{new Pair<>(new Square('f', 6), new Square('e', 5))});
//        return map;
//    }
}
