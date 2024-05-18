package Array;

import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {

		int count = 0;
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();

		int[] arr = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = s.nextInt();
		}

		int num = s.nextInt();

		for (int i = 0; i < k; i++) {
			if (arr[i] == num)
				count++;
		}
		System.out.println(count);
	}
}
