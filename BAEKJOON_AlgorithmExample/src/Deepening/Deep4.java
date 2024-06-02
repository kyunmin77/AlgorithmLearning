package Deepening;

import java.util.Scanner;

public class Deep4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int palindrome = 1;
		
		for (int i = 0; i < word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-(i + 1))) {
				palindrome = 0;
				break;
			}
		}
		
		System.out.println(palindrome);
	}
}
