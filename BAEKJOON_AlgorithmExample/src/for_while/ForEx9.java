package for_while;

import java.util.Scanner;

public class ForEx9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int k = s.nextInt();
		
		for(int i = 0; i<k;i++) {
			for(int j =0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
