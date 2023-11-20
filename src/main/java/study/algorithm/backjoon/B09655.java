package study.algorithm.backjoon;

/**
 * 돌 게임
 */

import java.io.*;

public class B09655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[Math.max(N,3)];
        dp[0] = true;
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i < N ; i++) {
            dp[i] = !dp[i-1];
        }
        System.out.println(dp[N-1] ? "SK" : "CY");
    }
}
