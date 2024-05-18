package Array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		int n = 0;
		int x = 0;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		x = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(arr[i]<x){
				System.out.print(arr[i] + " ");
			}
		}
	}
}
