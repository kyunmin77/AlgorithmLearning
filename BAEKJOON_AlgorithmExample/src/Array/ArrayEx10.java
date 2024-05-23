package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		double[] score = new double[N];
		double sum_of_avg = 0;

		for (int i = 0; i < N; i++) {
			score[i] = s.nextInt();
		}

		double max = Arrays.stream(score).max().getAsDouble();

		for (int i = 0; i < N; i++) {
			sum_of_avg += (score[i] / max) * 100;
		}

		double avg = sum_of_avg / N;
		System.out.println(avg);
	}
}
