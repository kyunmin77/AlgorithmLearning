package for_while;

import java.util.Scanner;

public class forEx4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String temp = s.nextLine();
		int total = Integer.parseInt(temp);
		temp = s.nextLine();
		int kinds = Integer.parseInt(temp);
		int price = 0;
		int qnt = 0;
		int sumOfOnePrdct = 0;
		int sumOfAll=0;
		
		for(int i =0;i<kinds;i++) {
			price = s.nextInt();
			qnt = s.nextInt();
			sumOfOnePrdct = price*qnt;
			sumOfAll += sumOfOnePrdct;
		}
		
		if(total == sumOfAll)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
