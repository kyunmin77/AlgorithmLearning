package StringEx;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringEx8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sen = s.nextLine();
		
		StringTokenizer st = new StringTokenizer(sen," ");
		System.out.println(st.countTokens());
	}
}
