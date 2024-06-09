package Deepening;

import java.util.Scanner;

public class Deep7 {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		int count = 0;
		
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			
			if(check() == true) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean check() {
		
		boolean[] found = new boolean[26];
		int prev = 0;
		String str = s.next();
		
		for(int i = 0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(found[now-'a'] == true) {
					return false;
				} else {
					found[now-'a'] = true;
					prev = now;
				}
			} else {
				continue;
			}
		}
		return true;
	}
}
