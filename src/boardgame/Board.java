package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece [][] pieces;

    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Erro ao criar tabuleiro, é necessário ao menos 1 linha e 1 coluna");

        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if(!positionExistis(row, column)){
            throw new BoardException("Posição não existente ");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posição não existe");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("Posição já existe" + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExistis(int row, int column){
       return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExistis(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Posição não existe");
        }
       return piece(position) != null;
    }

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new RuntimeException("Posição não existente");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

}
