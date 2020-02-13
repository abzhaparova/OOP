package lab1;
import java.util.Scanner;

public class Problem2 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		double side = scr.nextDouble();
		
		System.out.println("Area is: " + (side * side));
		System.out.println("Perimeter is: " + (side * 4));
		System.out.println("Diogonal is: " + ((Math.sqrt(2)) *side));
		
	}
}
