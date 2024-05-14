package for_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForEx8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a=0;
		int b=0;

		int k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + (i+1) + ": " + a + " + " + b + " = " +
					(a + b) + "\n");
		}
		
		bw.close(); // close를 해야 출력이 됨
	}
}


