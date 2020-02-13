package problem4;

abstract class Piece {
	public int  x, y;

	public Piece(int x, int y){//starting position
		this.x = x;
		this.y = y;
	}

	public void Move(int x, int y){
		if((x>=0 && x<=8) && (y>=0 && y<=8) ){
			this.x = x;
			this.y = y;
		}
	}

	public boolean isLegalMove(int x, int y){
		if((x>=0 && x<=8) && (y>=0 && y<=8) ) return true;
		else return false;
	}

	public double absDouble(double a){
		if(a>0) return a;
		else if(a<0) return -1.0 * a;
		else return 0.0;
	}
}