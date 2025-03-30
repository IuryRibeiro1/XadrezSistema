import boardgame.Board;
import boardgame.Position;
import boardgame.UI;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {


        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}