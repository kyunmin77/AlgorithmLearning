package Array;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int first = 0;
		int last = 0;
		int num = 0;

		int[] poket = new int[N];
		for (int i = 0; i < N; i++) {
			poket[i] = 0;
		}

		for (int i = 0; i < M; i++) {
			first = s.nextInt();
			last = s.nextInt();
			num = s.nextInt();

			for (int k = first - 1; k < last; k++) {
				poket[k] = num;
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(poket[i] + " ");
		}
	}
}
