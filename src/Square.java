public class Square {
    public final int row;
    public final char column;
    public final boolean isBlack;

    public Square(char column,int row,boolean isBlack ) {
        this.column = column;
        this.row = row;
        this.isBlack=isBlack;
    }
}
