package for_while;

import java.util.Scanner;

public class ForEx12
{
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;

		while (s.hasNextInt()) {
			a = s.nextInt();
			b = s.nextInt();
			sum = a + b;

			System.out.println(sum);
		
		}
	}
}