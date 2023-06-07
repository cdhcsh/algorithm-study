package study.algorithm.backjoon;

/**
 * 캡팀 이다솜
 */

import java.io.*;
import java.util.Arrays;

public class B01660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] balls = new int[122];
        balls[1] = 1;
        for (int i = 2 ; i < balls.length; i++) {
            balls[i] = i + balls[i-1];
        }
        for (int i = 2; i < balls.length; i++) {
            balls[i] = balls[i]+balls[i-1];
        }
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        for (int i = 1; i < balls.length; i++) {
            int c = balls[i];
            if(c > n) break;
            dp[c] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < balls.length; j++) {
                int c = balls[j];
                if(i < c) break;
                dp[i] = Math.min(dp[i],dp[i-c]+1);
            }
        }
        System.out.println(dp[n]);




    }
}
