import java.util.Scanner;

public class White implements Player {
    private final Pieces pieces = Pieces.WHITE;
    private final Scanner inputMove;

    White(Scanner inputMove) {
        this.inputMove = inputMove;
    }

    @Override
    public Pieces getValue() {
        return this.pieces;
    }

    @Override
    public Square chooseSquare(Pieces[][] board) {
        String move = inputMove.next();
        return new Square(move.charAt(0), Character.getNumericValue(move.charAt(1)) - 1);
    }
}
