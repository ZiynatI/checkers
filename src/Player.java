public interface Player {
    SituationOfSquare getValue();

    Square chooseSquare(GameBoard board);

    /**
     * Returns Square where piece should go to take another piece.If there are not pieces which can be taken, returns
     * null.
     */
    default Square takePiece(GameBoard board, SituationOfSquare enemysValue) {

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (board.getBoard()[row][column] == this.getValue()) {
                    if(row>=1&&column>=1){
                        if(board.getBoard()[row-1][column-1]==enemysValue){
                            return new Square()
                        }
                    }
                }
            }
        }
        return null;
    }
}
