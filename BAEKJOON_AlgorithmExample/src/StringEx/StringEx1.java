package StringEx;

import java.util.Scanner;

public class StringEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		int i = s.nextInt();

		System.out.println(word.charAt(i - 1));

	}
}
