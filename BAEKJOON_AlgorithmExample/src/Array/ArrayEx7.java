package Array;

import java.util.Scanner;

public class ArrayEx7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] student = new int[30];
		int num = 0;

		for (int i = 0; i < 28; i++) {
			num = s.nextInt();
			student[num - 1] = 1;
		}
		for (int i = 0; i < 30; i++) {
			if (student[i] == 0)
				System.out.println(i + 1);
		}
	}
}
