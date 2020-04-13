package Piece;
public abstract class Piece {
	public String type;
	public Piece(String t) {
		type=t;
	}
	public String getType() {
		return type;
	}
	public abstract boolean validMove(int xInit,int yInit, int xFinal, int yFinal, boolean captureMove);
}
