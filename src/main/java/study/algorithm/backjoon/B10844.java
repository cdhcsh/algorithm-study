package study.algorithm.backjoon;

/**
 * 쉬운 계단수
 */

import java.io.*;

public class B10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[][] dp = new long[n][11];
        for (int i = 0; i <= 9; i++) {
            dp[0][i] = 1;
        }
        for(int i = 1 ; i < n ; i++){
            dp[i][0] = dp[i-1][1];
            for (int j = 1; j <= 9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
            }
        }
        long answer = 0;
        for (int i = 1; i <= 9 ; i++) {
            answer+=dp[n-1][i];
        }
        bw.write(answer%1000000000+"");
        bw.close();
    }
}
