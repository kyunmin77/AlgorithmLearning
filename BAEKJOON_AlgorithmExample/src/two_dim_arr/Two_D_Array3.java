package two_dim_arr;

import java.util.Scanner;

public class Two_D_Array3 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char[][] ch = new char[5][15];
		String str = "";

		for (int i = 0; i < 5; i++) {
			str = s.nextLine();
			for (int j = 0; j < str.length(); j++) {
				ch[i][j] = str.charAt(j);
			}
		}
		
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if(ch[i][j]=='\0') 
					continue;
				System.out.print(ch[i][j]);
			}
		}

		
	}
}
