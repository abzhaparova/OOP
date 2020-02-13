package problem4;

public class Main {

	public static void main(String[] args) {
		King king = new King(0, 0);
		Rook rook = new Rook(2, 4);
		Bishop bishop = new Bishop(3, 4);
		Queen queen = new Queen(3, 4);
		Knight knight = new Knight(4, 5);
		Pawn pawn = new Pawn(2, 5);

		if(king.isLegalMove(1, 0)){
			System.out.println("ok");
		}else System.out.println("not ok");

		if(rook.isLegalMove(6, 7)){
			System.out.println("ok");
		} else System.out.println("not ok");

		if(bishop.isLegalMove(5, 5)){
			System.out.println("ok");
		} else System.out.println("not ok");

		if(queen.isLegalMove(2, 5)){
			System.out.println("ok");
		} else System.out.println("not ok");

		if(knight.isLegalMove(1, 4)){
			System.out.println("ok");
		} else System.out.println("not ok");
		
		if(pawn.isLegalMove(2, 6)){
			System.out.println("ok");
		} else System.out.println("not ok");
	}
}