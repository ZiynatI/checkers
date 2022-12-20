public enum SituationOfSquare {

    WHITE_PIECE("W"),
    BLACK_PIECE("B"),
    EMPTY_SQUARE("-"),
    WHITE_SQUARE("▓▓");

    String st;

    SituationOfSquare(String st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return st;
    }
}
