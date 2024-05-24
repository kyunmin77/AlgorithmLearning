package StringEx;

import java.util.Scanner;

public class StringEx6 { 		// indexOf() >> String에서 char를 찾아서 위치 반환 & 부재시 -1 반환
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.next();

		for (int code = 'a'; code <= 'z'; code++) {
			System.out.print(word.indexOf(code) + " ");
		}

	}
}
