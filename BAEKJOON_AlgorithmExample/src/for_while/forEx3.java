package for_while;

import java.util.Scanner;

public class forEx3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
