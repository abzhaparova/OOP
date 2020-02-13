package problem4;

public class Rook extends Piece {
	public Rook(int x, int y){
		super(x, y);
	}

	public boolean isLegalMove(int _x, int _y){
		if(super.isLegalMove(_x, _y) && x == _x && y != _y) return true;
		else if(super.isLegalMove(_x, _y) && x != _x && y == _y) return true;
		else return false;
	}
}
//The rook piece can move anywhere from 1 to 7 squares in any direction, 