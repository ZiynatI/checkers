public interface Player {
    SituationOfSquare getValue();

    Square chooseSquare(GameBoard board);

    /**
     * Returns Square where piece should go to take another piece.If there are not pieces which can be taken, returns
     * null.
     */
     default Square takePiece(GameBoard board) {
//        for(SituationOfSquare[] row : board.board){
//            for(SituationOfSquare cell:row){
//                if(cell==this.getValue()){
//                    if()
//                }
//            }
//        }
        return null;
    }
}
