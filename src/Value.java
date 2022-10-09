public enum Value {

    WHITE("⚫"),
    BLACK("⚪"),
    EMPTY_SQUARE("  ");
    //    LIGHT_SQUARE("▓▓");


    String displayValue;

    Value(String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return displayValue;
    }
}
