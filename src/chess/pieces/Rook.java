package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //above
        p.setValue(position.getRow() - 1, position.getCollumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()] [p.getCollumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (getBoard().thereIsPiece(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getCollumn()] = true;
        }

        //Left
        p.setValue(position.getRow(), position.getCollumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()] [p.getCollumn()] = true;
            p.setCollumn(p.getCollumn() - 1);
        }
        if (getBoard().thereIsPiece(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getCollumn()] = true;
        }

        //Right
        p.setValue(position.getRow(), position.getCollumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()] [p.getCollumn()] = true;
            p.setCollumn(p.getCollumn() + 1);
        }
        if (getBoard().thereIsPiece(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getCollumn()] = true;
        }

        //Below
        p.setValue(position.getRow() + 1, position.getCollumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsPiece(p)) {
            mat[p.getRow()] [p.getCollumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().thereIsPiece(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getCollumn()] = true;
        }





        return null;
    }
}
