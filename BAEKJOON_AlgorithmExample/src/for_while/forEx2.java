package for_while;

import java.util.Scanner;

public class forEx2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String tmp = s.nextLine();
		int num = Integer.parseInt(tmp);

		int[] a = new int[num];
		int[] b = new int[num];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			a[i] = s.nextInt();
			b[i] = s.nextInt();
		}
		for (int i = 0; i < num; i++) {
			sum = a[i] + b[i];
			System.out.println(sum);
		}
		
		s.close();

	}
}
