package Deepening;

import java.util.Scanner;

public class Deep3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			for (int k = n - (i + 1); k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * (i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
