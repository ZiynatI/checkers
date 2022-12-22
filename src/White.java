import java.util.Scanner;

public class White extends Player {
    private int numberOfPieces;
    private final SituationOfSquare pieces = SituationOfSquare.WHITE_PIECE;
    private final Scanner inputMove;

    White(Scanner inputMove) {
        this.numberOfPieces = 12;
        this.inputMove = inputMove;
    }

    @Override
    public SituationOfSquare getValue() {
        return this.pieces;
    }

    @Override
    public Square chooseSquare(GameBoard board) {
        String move = inputMove.next();
        return new Square(move.charAt(0), Character.getNumericValue(move.charAt(1)) - 1);
    }
}
