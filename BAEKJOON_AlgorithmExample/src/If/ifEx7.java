package If;

import java.util.Arrays;
import java.util.Scanner;

public class ifEx7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] dice = new int[3];
		int money = 0;
		for(int i =0;i<dice.length;i++) {
			dice[i] = s.nextInt();
		}
		
		if(dice[0] == dice[1] && dice[1] == dice[2]) {
			money = 10000 + dice[0]*1000;
			System.out.println(money);
		} else if(dice[0] == dice[1] && dice[1] != dice[2]) {
			money = 1000 + dice[0]*100;
			System.out.println(money);
		} else if(dice[0] != dice[1] && dice[1] == dice[2]) {
			money = 1000 + dice[1]*100;
			System.out.println(money);
		} else if(dice[0] != dice[1] && dice[0] == dice[2]) {
			money = 1000 + dice[0]*100;
			System.out.println(money);
		} else {
			int max = Arrays.stream(dice).max().getAsInt();
			money = max*100;
			System.out.println(money);
		}
		
	}
}
