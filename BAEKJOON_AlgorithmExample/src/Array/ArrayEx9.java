package Array;

import java.util.Scanner;

public class ArrayEx9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int first = 0;
		int last = 0;

		int[] poket = new int[N];
		for (int i = 0; i < N; i++) {
			poket[i] = i + 1;
		}

		int tmp = 0;
		for (int i = 0; i < M; i++) {
			first = s.nextInt() - 1;
			last = s.nextInt() - 1;

			while (first < last) {
				tmp = poket[first];
				poket[first] = poket[last];
				poket[last] = tmp;
				first++;
				last--;
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(poket[i] + " ");
		}
	}
}
