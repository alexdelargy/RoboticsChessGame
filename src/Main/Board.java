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
				boardPieces[0][count]=new RookBlack(0,count);
				break; 
			case 1:
				boardPieces[0][count]=new HorseBlack(0,count);
				break;
			case 2:
				boardPieces[0][count]=new BishopBlack(0,count);
				break;
			case 3:
				boardPieces[0][count]=new QueenBlack(0,count);
				break;
			case 4:
				boardPieces[0][count]=new KingBlack(0,count);
				break;
			case 5:
				boardPieces[0][count]=new BishopBlack(0,count);
				break;
			case 6:
				boardPieces[0][count]=new HorseBlack(0,count);
				break;
			case 7:
				boardPieces[0][count]=new RookBlack(0,count);
				break;
			case 8:
				boardPieces[7][count-8]=new RookWhite(7,count-8);
				break;
			case 9:
				boardPieces[7][count-8]=new HorseWhite(7,count-8);
				break;
			case 10:
				boardPieces[7][count-8]=new BishopWhite(7,count-8);
				break;
			case 11:
				boardPieces[7][count-8]=new QueenWhite(7,count-8);
				break;
			case 12:
				boardPieces[7][count-8]=new KingWhite(7,count-8);
				break;
			case 13:
				boardPieces[7][count-8]=new BishopWhite(7,count-8);
				break;
			case 14:
				boardPieces[7][count-8]=new HorseWhite(7,count-8);
				break;
			case 15:
				boardPieces[7][count-8]=new RookWhite(7,count-8);
				break;
			}
		}
		updateBoardPieces();
	}
}
