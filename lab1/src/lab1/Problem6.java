package lab1;

import java.util.Scanner;

public class Problem6 {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		String word = scr.nextLine();
		boolean isPalindrome = true;
		
		int i = 0;
		int j = word.length() - 1;
		while(i < j) {
			if(word.charAt(i) != word.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i += 1;
			j -= 1;
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}		
	}
}