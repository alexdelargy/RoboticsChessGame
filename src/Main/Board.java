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
public class Board {
	public colors[][]boardColors;
	public Piece[][]boardPieces;
	public RookBlack rookBlack1;
	public HorseBlack horseBlack1;
	public BishopBlack bishopBlack1;
	public QueenBlack queenBlack;
	public KingBlack kingBlack;
	public BishopBlack bishopBlack2;
	public HorseBlack horseBlack2;
	public RookBlack rookBlack2;
	public RookWhite rookWhite1;
	public HorseWhite horseWhite1;
	public BishopWhite bishopWhite1;
	public QueenWhite queenWhite;
	public KingWhite kingWhite;
	public BishopWhite bishopWhite2;
	public HorseWhite horseWhite2;
	public RookWhite rookWhite2;

	public class colors{
		String color;
		public colors(String c) {
			color=c;
		}
		public String getColor() {
			return color;
		}
	}
	public Board() {
		boardColors=new colors[8][8];
		boardPieces=new Piece[8][8];
		for (int i=0;i<boardColors.length;i++) {
			for (int k=0;k<boardColors[i].length;k++) {
				if (i%2==0) {
					if(k%2==0) boardColors[i][k]=new colors("white");
					else boardColors[i][k]=new colors("black");
				}
				else {
					if (k%2==1)boardColors[i][k]=new colors("white");
					else boardColors[i][k]=new colors("black");
				}
			}
		}
		this.resetBoard();
	}
	public void updateBoardColors() {
		for (int i=0;i<boardColors.length;i++) {
			for (int k=0;k<boardColors[i].length;k++) {
				System.out.printf("%-7s",boardColors[i][k].getColor());
			}
			System.out.println("\n");
		}
	}
	public void updateBoardPieces() {
		for (int i=0;i<boardPieces.length;i++) {
			for (int k=0;k<boardPieces[i].length;k++) {
				System.out.printf("%-7s",boardPieces[i][k].getType());
			}
			System.out.println("\n");
		}
	}
	public void resetBoard() {
		updateBoardColors();
		System.out.println();
		int i,k;
		for (i=0;i<8;i++) {
			boardPieces[1][i]=new PawnBlack(1,i);
			boardPieces[6][i]=new PawnWhite(6,i);
		}	
		for (int j=0;j<8;j++) {
			boardPieces[2][j]=new Empty();
			boardPieces[3][j]=new Empty();
			boardPieces[4][j]=new Empty();
			boardPieces[5][j]=new Empty();
		}
		for(int count=0;count<16;count++) {
			switch(count) {
			case 0:
				rookBlack1=new RookBlack(0,count);
				boardPieces[0][count]=rookBlack1;

				break; 
			case 1:
				horseBlack1=new HorseBlack(0,count);
				boardPieces[0][count]=horseBlack1;

				break;
			case 2:
				bishopBlack1=new BishopBlack(0,count);
				boardPieces[0][count]=bishopBlack1;

				break;
			case 3:
				queenBlack=new QueenBlack(0,count);
				boardPieces[0][count]=queenBlack;

				break;
			case 4:
				kingBlack=new KingBlack(0,count);
				boardPieces[0][count]=kingBlack;

				break;
			case 5:
				bishopBlack2=new BishopBlack(0,count);
				boardPieces[0][count]=bishopBlack2;

				break;
			case 6:
				horseBlack2=new HorseBlack(0,count);
				boardPieces[0][count]=horseBlack2;
				break;
			case 7:
				rookBlack2=new RookBlack(0,count);
				boardPieces[0][count]=rookBlack2;
				break;
			case 8:
				rookWhite1=new RookWhite(7,count-8);
				boardPieces[7][count-8]=rookWhite1;
				break;
			case 9:
				horseWhite1=new HorseWhite(7,count-8);
				boardPieces[7][count-8]=horseWhite1;
				break;
			case 10:
				bishopWhite1=new BishopWhite(7,count-8);
				boardPieces[7][count-8]=bishopWhite1;
				break;
			case 11:
				queenWhite=new QueenWhite(7,count-8);
				boardPieces[7][count-8]=queenWhite;
				break;
			case 12:
				kingWhite=new KingWhite(7,count-8);
				boardPieces[7][count-8]=kingWhite;
				break;
			case 13:
				bishopWhite2=new BishopWhite(7,count-8);
				boardPieces[7][count-8]=bishopWhite2;
				break;
			case 14:
				horseWhite2=new HorseWhite(7,count-8);
				boardPieces[7][count-8]=horseWhite2;
				break;
			case 15:
				rookWhite2=new RookWhite(7,count-8);
				boardPieces[7][count-8]=rookWhite2;
				break;
			}
		}
		updateBoardPieces();
	}
}
