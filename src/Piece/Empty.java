package Piece;

public class Empty extends Piece {

	public Empty() {
		super("Empty");
	}

	@Override
	public boolean validMove(int xInit, int yInit, int xFinal, int yFinal, boolean captureMove) {
		// TODO Auto-generated method stub
		return false;
	}
}
