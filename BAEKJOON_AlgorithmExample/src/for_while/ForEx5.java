package for_while;

import java.util.Scanner;

public class ForEx5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		for(int i =num;i>0;i=i-4) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
