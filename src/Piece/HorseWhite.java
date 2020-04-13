package Piece;
public class HorseWhite extends Piece {
	private int locX,locY;

	public HorseWhite(int x,int y) {
		super("Horse");
		locX=x;
		locY=y;
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean validMove(int xInit, int yInit, int xFinal, int yFinal, boolean captureMove) {
		if(((Math.abs(xFinal-xInit))==2&&(Math.abs(yFinal-yInit)==1))||((Math.abs(xFinal-xInit))==2&&(Math.abs(yFinal-yInit)==1)))return true;
		else return false;
	}
}
