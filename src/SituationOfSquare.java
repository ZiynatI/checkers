public enum SituationOfSquare {

    WHITE("W"),
    BLACK("B"),
    EMPTY_SQUARE("-");

    String st;

    SituationOfSquare(String st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return st;
    }
}
