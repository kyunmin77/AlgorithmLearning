package If;

import java.util.Scanner;

public class ifEx5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int H = 0;
		int M = 0;

		H = s.nextInt();
		M = s.nextInt();

		int Mdiff = M - 45;

		if (Mdiff >= 0)
			System.out.println(H + " " + Mdiff);
		else if (H != 0)
			System.out.println((H - 1) + " " + (60 + Mdiff));
		else
			System.out.println(23 + " " + (60 + Mdiff));
	}
}
