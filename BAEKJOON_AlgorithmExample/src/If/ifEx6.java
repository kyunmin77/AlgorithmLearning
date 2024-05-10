package If;

import java.util.Scanner;

public class ifEx6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int H = 0;
		int M = 0;
		int min = 0;

		H = s.nextInt();
		M = s.nextInt();
		min = s.nextInt();

		int minSum = M + min;

		if (minSum < 60) {
			System.out.println(H + " " + minSum);
		} else {
			while (minSum >= 60) {

				minSum -= 60;
				H++;
				if (H == 24)
					H = 0;

			} // while

			System.out.println(H + " " + minSum);
		}

	}
}
