package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);


        //Verificar se tem peças acima da torre
        p.setValues(position.getRow() - 1, position.getColumn());
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;


        }
//      Verificar se tem peças a direita
        p.setValues(position.getRow(), position.getColumn() - 1);
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }
//      Verificar se tem peças a esquerda
        p.setValues(position.getRow(), position.getColumn() + 1);
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        //Verificar se tem peças abaixo da torre
        p.setValues(position.getRow() + 1, position.getColumn());
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }


//#############################################################################
        //Verificar se tem peças bloqueando o bispo
        p.setValues(position.getRow() - 1, position.getColumn()-1);
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() -1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;


        }
//      Verificar se tem peças a direita
        p.setValues(position.getRow() -1, position.getColumn() + 1);
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()-1,p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }
//      Sudeste
        p.setValues(position.getRow() +1, position.getColumn() + 1);
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()+ 1, p.getColumn() + 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        //SudoEste
        p.setValues(position.getRow() + 1, position.getColumn()-1);
//      Enquanto a posição estiver vaga, ela será verdadeira
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()+1 ,p.getRow() - 1);
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        return mat;

    }


    }

