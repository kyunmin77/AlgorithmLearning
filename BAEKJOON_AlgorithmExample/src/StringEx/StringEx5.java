package StringEx;

import java.util.Scanner;

public class StringEx5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int n = s.nextInt();
		String num = s.next();
		
		s.close();
		
		for (int i = 0; i < n; i++) {
			sum += num.charAt(i) - '0';
		}
		System.out.println(sum);
		
	}
}
