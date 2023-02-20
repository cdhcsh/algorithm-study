package study.algorithm.backjoon;

/**
 * 다리놓기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] dp = new int[30][30];

        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());	// N = r
            int M = Integer.parseInt(st.nextToken());	// M = n

            bw.write(dp[M][N]+"\n");
        }
        bw.close();
    }
}
