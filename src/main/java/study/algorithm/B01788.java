package study.algorithm;

/**
 * 피보나치 수의 확장
 */

import java.io.*;

public class B01788 {
    static final int MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int size = Math.abs(n);
        int b = Integer.compare(n, 0);
        int[] dp = new int[Math.max(size+1,2)];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= size ; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%MOD;
        }
        System.out.println(b);
        System.out.println(dp[size]);
    }
}
