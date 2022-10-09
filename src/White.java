import java.util.Scanner;

public class White implements Player {
    private final Value value = Value.WHITE;
    private final Scanner inputMove;

    White(Scanner inputMove) {
        this.inputMove = inputMove;
    }

    @Override
    public Value getValue() {
        return this.value;
    }

    @Override
    public Square chooseSquare(Value[][] board) {
        String move = inputMove.next();
        return new Square(move.charAt(0), Character.getNumericValue(move.charAt(1)) - 1);
    }
}
