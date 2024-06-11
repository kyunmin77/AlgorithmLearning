package two_dim_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Two_D_Array2 {
   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int[][] arr = new int[9][9];

      for (int i = 0; i < 9; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < 9; j++) {
            arr[i][j] = Integer.parseInt(st.nextToken());
         }
      }

      int max = 0;
      int index_row = 0;
      int index_col = 0;
      for (int i = 0; i < 9; i++) {
         for (int j = 0; j < 9; j++) {
            if (max <= arr[i][j]) {
               max = arr[i][j];
               index_row = i + 1;
               index_col = j + 1;
            }
         }
      }
      br.close();
      System.out.println(max);
      System.out.println(index_row + " " + index_col);
   }
}