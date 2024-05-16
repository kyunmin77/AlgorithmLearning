package for_while;

import java.util.Scanner;

public class ForEx11 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;

		while (true) {
			a = s.nextInt();
			b = s.nextInt();

			sum = a + b;

			if (a == 0 && b == 0) {
				break;
			}
			System.out.println(sum);
		}

		s.close();

	}
}
