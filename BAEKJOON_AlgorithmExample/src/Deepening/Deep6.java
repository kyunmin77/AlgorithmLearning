package Deepening;

import java.util.Scanner;

public class Deep6 { // contains(), replace()
	public static void main(String[] args) {

		String[] chr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		for (int i = 0; i < chr.length; i++) {
			if(str.contains(chr[i])) {
				str = str.replace(chr[i], "!");
			}
		}
		
		System.out.println(str.length());
	}
}
