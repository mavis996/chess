package chess;

import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {
    private ChessGame.TeamColor pieceColor;
    private ChessPiece.PieceType type;
    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
            this.pieceColor = pieceColor;
            this.type = type;
        }
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN;
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return this.pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return this.type;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        if (this.type == PieceType.BISHOP) {
            Bishop bishop = new Bishop(this.pieceColor);
            return bishop.pieceMoves(board, myPosition);
        } else if (this.type == PieceType.KING) {
            King king = new King(this.pieceColor);
            return king.pieceMoves(board, myPosition);
        } else if (this.type == PieceType.QUEEN) {
            Queen queen = new Queen(this.pieceColor);
        } else if (this.type == PieceType.KNIGHT) {
            Knight knight = new Knight(this.pieceColor);
            return knight.pieceMoves(board, myPosition);
        } else if (this.type == PieceType.ROOK) {
            Rook rook = new Rook(this.pieceColor);
            return rook.pieceMoves(board, myPosition);
        } else if (this.type == PieceType.PAWN) {
            Pawn pawn = new Pawn(this.pieceColor);
            return pawn.pieceMoves(board, myPosition);
        } else {
            throw new RuntimeException("Not implemented");
        }
    }

        @Override
        public String toString() {
            return super.toString();
        }
    }
