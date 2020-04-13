package Piece;
public class KingWhite extends Piece{
	private int locX,locY;

	public KingWhite(int x,int y) {
		super("King");
		locX=x;
		locY=y;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validMove(int xInit, int yInit, int xFinal, int yFinal, boolean captureMove) {
		// TODO Auto-generated method stub
		double magnitudeMove=Math.sqrt(Math.pow((xFinal-xInit), 2)+Math.pow((yFinal-yInit), 2));
		if ((magnitudeMove==1)||(magnitudeMove==Math.sqrt(2))) {
			locX=xFinal;
			locY=yFinal;
			return true;
		}
		else return false;
		
	}
}
