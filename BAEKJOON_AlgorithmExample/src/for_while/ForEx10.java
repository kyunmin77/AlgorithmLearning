package for_while;

import java.util.Scanner;

public class ForEx10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
