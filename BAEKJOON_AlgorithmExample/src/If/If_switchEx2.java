package If;

import java.util.Scanner;

public class If_switchEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String temp = s.nextLine();
		int score = Integer.parseInt(temp);
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else if(score>=0)
			System.out.println("F");
		
	}
}
