package problem4;

public class Knight extends Piece {
	public Knight(int x, int y){
		super(x, y);
	}

	public boolean isLegalMove(int _x, int _y){
	if(super.isLegalMove(_x, _y) && super.absDouble(x-_x) == 1 && super.absDouble(y-_y) == 2) return true;
	else if(super.isLegalMove(_x, _y) && super.absDouble(x-_x) == 2 && super.absDouble(y-_y) == 1) return true;
	else return false;	
	}
}
//The Knight piece can move forward, backward, 
//left or right two squares and must then move one square in either perpendicular direction.