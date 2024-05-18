package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int[] arr = new int[k];
		
		for (int i = 0; i < k; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+ " " + arr[k-1]);

	}
}
