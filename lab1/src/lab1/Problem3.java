package lab1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int score = scr.nextInt();
		
		if( score >= 95){
			System.out.println("Youre grade is: A");
		}else if(score >= 90) {
			System.out.println("Youre grade is: A-");
		}else if(score >= 85) {
			System.out.println("Youre grade is: B+");
		}else if(score >= 80) {
			System.out.println("Youre grade is: B");
		}else if(score >= 75) {
			System.out.println("Youre grade is: B-");
		}else if(score >= 70) {
			System.out.println("Youre grade is: C+");
		}else if(score >= 65) {
			System.out.println("Youre grade is: C");
		}else if(score >= 60) {
			System.out.println("Youre grade is: C-");
		}else if(score >= 55) {
			System.out.println("Youre grade is: D+");
		}else if(score >= 50) {
			System.out.println("Youre grade is: D");
		}else {
			System.out.println("Youre grade is: F");
		}
	}
}
