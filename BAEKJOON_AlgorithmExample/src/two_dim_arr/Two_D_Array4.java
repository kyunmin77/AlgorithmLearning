package two_dim_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Two_D_Array4 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      boolean[][] posted = new boolean[100][100];
      int total = 0;
      int num = Integer.parseInt(br.readLine());

      for (int n = 0; n < num; n++) {
         st = new StringTokenizer(br.readLine());
         
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         
         int x_start = x-1;
         int y_start = y-1;
         int x_end = x_start+10;
         int y_end = y_start+10;
         
         for(int i = x_start; i < x_end; i++) {
            for(int j = y_start; j < y_end; j++) {
               if(!posted[i][j]) {
                  posted[i][j] = true;
                  total++;
               }
            }
         }
         
      }
      System.out.println(total);
   }
}
