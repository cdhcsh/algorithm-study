package study.algorithm.backjoon;

/**
 * 동물원
 */

import java.io.*;

public class B01309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int mod = 9901;

        int[][] dp = new int[N+1][3];
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%mod;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2])%mod;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1])%mod;
        }
        System.out.println((dp[N][0] + dp[N][1] + dp[N][2])%mod);


    }
}
