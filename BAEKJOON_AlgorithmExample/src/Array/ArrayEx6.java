package Array;

import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int j = 0;
		int k = 0;
		int[] poket = new int[N];
		for (int i = 0; i < N; i++) {
			poket[i] = (i + 1);
		}

		for (int i = 0; i < M; i++) {
			j = s.nextInt();
			k = s.nextInt();

			int temp = poket[j - 1];
			poket[j - 1] = poket[k - 1];
			poket[k - 1] = temp;
			
		}
		for (int i = 0; i < N; i++) {
			System.out.print(poket[i] + " ");
		}
	}
}
