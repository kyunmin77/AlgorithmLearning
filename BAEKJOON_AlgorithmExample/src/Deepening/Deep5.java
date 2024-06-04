package Deepening;

import java.util.Scanner;

public class Deep5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int[] ch = new int[26]; // ch[0] =='A" ~ ch[25] == 'Z'

		for (int i = 0; i < word.length(); i++) {
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				ch[word.charAt(i) - 'A']++;
			} else if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
				ch[word.charAt(i) - 'a']++;
			}
		}

		int max = -1;
		char chtr = ' ';
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > max) {
				max = ch[i];
				chtr = (char)(65 + i);
			}
			else if(ch[i] == max) {
				chtr = '?';
			}
		}
		
		System.out.println(chtr);
	}
}
