package study.algorithm.backjoon;

/**
 * 제곱수의 합
 */

import java.io.*;
import java.util.Arrays;

public class B01699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int k = (int) Math.sqrt(i);
            int min = dp[i-1];
            for (int j = 2; j <= k; j++) {
                min = Math.min(min,dp[i-j*j]);
            }
            dp[i] = min+1;
        }
        System.out.println(dp[n]);

    }
}
