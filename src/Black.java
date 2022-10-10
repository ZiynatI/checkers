import java.util.Scanner;

public class Black implements Player {
    private final Pieces pieces = Pieces.BLACK;
    private final Scanner inputMove;

    Black(Scanner inputMove) {
        this.inputMove = inputMove;
    }

    @Override
    public Pieces getValue() {
        return this.pieces;
    }

    @Override
    public Square chooseSquare(Pieces[][] board) {
        String move = inputMove.next();
        return new Square(move.charAt(0), Character.getNumericValue(move.charAt(1)));

    }


}
