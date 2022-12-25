import java.util.Scanner;

public class HumanPlayer extends Player {
    private int numberOfPieces;
    private final SituationOfSquare piecesColor;
    private final Scanner inputMove;

    HumanPlayer(Scanner inputMove, SituationOfSquare piecesColor) {
        this.numberOfPieces = 12;
        this.piecesColor = piecesColor;
        this.inputMove = inputMove;
    }

    @Override
    public SituationOfSquare getValue() {
        return this.piecesColor;
    }

    @Override
    public Square chooseSquare(GameBoard board) {
        String move = inputMove.next();
        return new Square(move.charAt(0), Character.getNumericValue(move.charAt(1)));

    }
}
