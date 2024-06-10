package two_dim_arr;

import java.util.Scanner;

public class Two_D_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		int[][] sum = new int[n][m];

		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++) {
				A[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				B[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum[i][j] = A[i][j] + B[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
