package problem4;

public class Queen extends Piece{

	public Queen(int x, int y){
		super(x, y);
	}

	public boolean isLegalMove(int _x, int _y){
		if(super.isLegalMove(_x, _y) && x == _x && y != _y) return true;
		else if(super.isLegalMove(_x, _y) && x != _x && y == _y) return true;
		else if(super.isLegalMove(_x, _y) && (super.absDouble(x - _x) == super.absDouble(y - _y))) return true;
		else return false;		
	}
}
//The queen can move in any direction on a straight or diagonal path.
