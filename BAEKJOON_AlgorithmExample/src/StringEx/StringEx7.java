package StringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringEx7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" "); // " " 을 기준으로 문자열을 n개로 나눔

			int times = Integer.parseInt(str[0]);
			String word = str[1];

			for (int j = 0; j < word.length(); j++) {
				for (int k = 0; k < times; k++) {
					sb.append(word.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
