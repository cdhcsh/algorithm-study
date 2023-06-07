package study.algorithm.backjoon;

/**
 * 돌게임 3
 */

import java.io.*;

public class B09657 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[n+1];
        dp[1] = true;
        dp[3] = true;
        dp[4] = true;
        for (int i = 5; i <= n; i++) {
            if(dp[i-1] && dp[i-3] && dp[i-4]) dp[i] = false;
            else dp[i] = true;
        }
        if(dp[n]) System.out.println("SK");
        else System.out.println("CY");
    }
}
