package Main;
import Piece.BishopBlack;
import Piece.BishopWhite;
import Piece.HorseBlack;
import Piece.HorseWhite;
import Piece.KingBlack;
import Piece.KingWhite;
import Piece.PawnBlack;
import Piece.PawnWhite;
import Piece.Piece;
import Piece.QueenBlack;
import Piece.QueenWhite;
import Piece.RookBlack;
import Piece.RookWhite;
import Piece.Empty;

public class Move{
	Board board=new Board();
	public Move() {
		board.resetBoard();
	}
	public String kingWhite(int xInit,int yInit,int xFinal,int yFinal,boolean moveType) {
		if(KingWhite.validMove(xInit,yInit,xFinal,yFinal,moveType)) {
			board.boardPieces[xFinal][xInit]=board.boardPieces[xInit][xFinal];
			return "Valid Move";
		}
		else return "Invalid Move";
	}
	public String queen(int xInit,int yInit, int xFinal, int yFinal, boolean moveType) {
		if(QueenWhite.validMove(xInit,yInit,xFinal,yFinal,moveType)) {
			board.boardPieces[xFinal][xInit]=board.boardPieces[xInit][xFinal];
			return "Valid Move";
		}
		else return "Invalid Move";
	}
	public String bishop(int xInit,int yInit,int xFinal, int yFinal, boolean moveType) {
		if(BishopWhite.validMove(xInit,yInit,xFinal,yFinal,moveType)) {
			board.boardPieces[xFinal][xInit]=board.boardPieces[xInit][xFinal];
			return "Valid Move";
		}
		else return "Invalid Move";
	}
	public String horse(int xInit, int yInit, int xFinal, int yFinal, boolean moveType) {
		if(HorseWhite.validMove(xInit,yInit,xFinal,yFinal,moveType)) {
			board.boardPieces[xFinal][xInit]=board.boardPieces[xInit][xFinal];
			return "Valid Move";
		}
		else return "Invalid Move";
	}
	public String rook(int xInit, int yInit, int xFinal, int yFinal, boolean moveType) {
		if(RookWhite.validMove(xInit,yInit,xFinal,yFinal,moveType)) {
			board.boardPieces[xFinal][xInit]=board.boardPieces[xInit][xFinal];
			return "Valid Move";
		}
		else return "Invalid Move";
	}
	public String pawn(int xInit, int yInit, int xFinal, int yFinal, boolean moveType) {
		if(PawnWhite.validMove(xInit,yInit,xFinal,yFinal,moveType)) {
			board.boardPieces[xFinal][xInit]=board.boardPieces[xInit][xFinal];
			return "Valid Move";
		}
		else return "Invalid Move";
	}
}