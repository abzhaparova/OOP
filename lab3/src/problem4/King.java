package problem4;

public class King extends Piece{
	public King(int x, int y){
		super(x, y);
	}

	public boolean isLegalMove(int _x, int _y){
		if(super.isLegalMove(_x, _y) && super.absDouble(x-_x) == 1 && super.absDouble(y - _y) == 1) return true;
		else if(super.isLegalMove(_x, _y) && super.absDouble(x-_x) == 0 && super.absDouble(y - _y) == 1) return true;
		else if(super.isLegalMove(_x, _y) && super.absDouble(x-_x) == 1 && super.absDouble(y - _y) == 0) return true;
		else return false;
	}
}
//The king piece can move one single square in any direction.
