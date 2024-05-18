package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
	public final static int MAX = 9;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] arr = new int[MAX];

		for (int i = 0; i < MAX; i++) {
			arr[i] = s.nextInt();
		}

		int max = arr[0];
		for (int i = 0; i < MAX; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		int count = 0;
		for (int i = 0; i < MAX; i++) {
			if (max == arr[i])
				break;
			count++;
		}
		System.out.println(max);
		System.out.println(count + 1);
	}
}
