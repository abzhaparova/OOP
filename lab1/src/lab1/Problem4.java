package lab1;
import java.util.Scanner;
public class Problem4 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		double a = scr.nextDouble();
		double b = scr.nextDouble();
		double c = scr.nextDouble();
		
		double d = b * b - 4 * a * c;
		
		if (d < 0) {
			System.out.println("Error");
		}else if(d == 0) {
			System.out.println("X is: " + ((-1) * b / 2 / a));
		}else {
			System.out.println("X1 is: " + (((-1) * b + Math.sqrt(d)) / 2 / a));
			System.out.println("X2 is: " + (((-1) * b - Math.sqrt(d)) / 2 / a));
		}
	}	
}
