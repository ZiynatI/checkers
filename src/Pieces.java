public enum Pieces {

    WHITE("W"),
    BLACK("B"),
    EMPTY_SQUARE("-");

    String st;

    Pieces(String st) {
        this.st = st;
    }

    @Override
    public String toString() {
        return st;
    }
}
