package lab1;

import java.util.Scanner;

public class Problem5 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Write amount of money");
		double money = scr.nextDouble();
		
		System.out.println("Write amount of interest");
		double interest = scr.nextDouble();
		
		System.out.println("New balance is: " + (money * (1 + interest / 100)));
	}
}
