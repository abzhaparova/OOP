package problem4;

public class Pawn extends Piece{
	public Pawn(int x, int y){
		super(x, y);
	}

	public boolean isLegalMove(int _x, int _y){
		
		if(super.isLegalMove(_x, _y) && y == 2 && (y+2)==_y && x == _x) return true;
		else if(super.isLegalMove(_x, _y) && (y+1)==_y && x == _x) return true;
		else return false;

	}
}

//pawn can go 2 steps at the beginning, then only one step