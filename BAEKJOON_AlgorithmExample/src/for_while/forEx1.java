package for_while;

import java.util.Scanner;

class forEx1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String temp = s.nextLine();
		int num = Integer.parseInt(temp);
		int result = 0;
		
		for (int i = 1; i < 10; i++) {
			result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}

	}
}