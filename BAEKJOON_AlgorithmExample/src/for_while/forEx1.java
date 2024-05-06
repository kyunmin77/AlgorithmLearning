package for_while;

import java.util.Scanner;

class forEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = 0;
		int b = 0;

		a = s.nextInt();
		b = s.nextInt();

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
	}
}