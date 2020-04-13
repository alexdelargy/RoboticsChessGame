package Piece;


public class BishopBlack extends Piece{
	private int locX,locY;
	public BishopBlack(int x,int y) {
		super("Bishop");
		locX=x;
		locY=y;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean validMove(int xInit, int yInit, int xFinal, int yFinal, boolean captureMove) {
		if (Math.atan((Math.abs(xFinal-xInit))/(Math.abs(yFinal-yInit)))==(Math.PI/4))return true;
		
		else return false;
	}
}
