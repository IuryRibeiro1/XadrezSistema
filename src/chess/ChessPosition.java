package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Valores inválidos, inserir de a1 até h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row , column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ((int)'a' + position.getColumn()), 8 - position.getRow() );
    }

//  A string vazia é para forçar o compilador entender que é uma concatenação de strings
    @Override
    public String toString(){
        return "" + column + row;
    }

}
