package StringEx;

import java.util.Scanner;

public class StringEx9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();

		int rn1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
		int rn2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());

		System.out.println(rn1 > rn2 ? rn1 : rn2);
	}
}