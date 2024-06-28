package genMath;

import java.util.Scanner;

public class GenMath1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int jinsu = s.nextInt();
		int sum = 0;
		int jinsuCount = 1;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			int n;
			char num = str.charAt(i);
			
			if('A' <= num && num <= 'Z') {
				n = num - 'A' + 10;
			} else {
				n = num - '0'; 
			}
			
			sum += n*jinsuCount;
			jinsuCount *= jinsu;
		}
		
		System.out.println(sum);
	}

}
