package Piece;

public class PawnBlack extends Piece{
	private int locX,locY;

	public PawnBlack(int x,int y) {
		super("Pawn");
		locX=x;
		locY=y;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validMove(int xInit, int yInit, int xFinal, int yFinal, boolean captureMove) {
		// TODO Auto-generated method stub
		if(captureMove) {
			if(((Math.abs(yInit-yFinal))==1)&&((Math.abs(yInit-yFinal))==1)) return true;
			else return false;
		}
		else if (((xInit-xFinal)==0)&&((yFinal-yInit)==1)) return true;
		else return false;
	}
}
