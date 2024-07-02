package If;

import java.util.Scanner;

public class ifEx3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String temp = s.nextLine();
		int year = Integer.parseInt(temp);
		
		if((year %4 == 0 && !(year%100==0)) || year%400 ==0) {
			System.out.println("1");
		}else
			System.out.println("0");
	}
}