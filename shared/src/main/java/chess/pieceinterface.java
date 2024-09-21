package chess;

import java.util.Collection;

public interface pieceinterface {
    ChessGame.TeamColor getTeamColor();

    ChessPiece.PieceType getPieceType();

    Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition);
}
