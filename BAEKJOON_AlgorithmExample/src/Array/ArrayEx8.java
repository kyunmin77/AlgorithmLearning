package Array;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayEx8 { 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		// HashSet은 중복된 값을 저장하지 않습니다.
		// 그리고 저장 순서가 유지되지 않습니다.
		int[] rest = new int[10];

		for (int i = 0; i < 10; i++) {
			rest[i] = s.nextInt() % 42;
		}
		for (int i = 0; i < 10; i++) {
			hs.add(rest[i]);
		}
		System.out.println(hs.size());
	}
}
