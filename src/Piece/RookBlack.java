package Piece;


public class RookBlack extends Piece{
	private int locX,locY;

	public RookBlack(int x,int y) {
		super("Rook");
		locX=x;
		locY=y;
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean validMove(int xInit, int yInit, int xFinal, int yFinal, boolean captureMove) {
		// TODO Auto-generated method stub
		double magnitudeX=Math.abs(xFinal-xInit);
		double magnitudeY=Math.abs(yFinal-yInit);
		if(((magnitudeY==0)&&(magnitudeX!=0))||((magnitudeX==0)&&(magnitudeY!=0))) return true;
		else return false;
	}
}
