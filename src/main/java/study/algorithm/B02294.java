package study.algorithm;

/**
 * 동전 2
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B02294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[K+1];
        Arrays.fill(dp,100001);
        dp[0] = 0;
        for (int c = 0; c < N; c++) {
            int coin = coins[c];
            for (int i = coin; i <= K; i++) {
                dp[i] = Math.min(dp[i-coin]+1,dp[i]);
            }
        }
        if(dp[K] == 100001){
            System.out.println("-1");
        }
        else{
            System.out.println(dp[K]);
        }
    }
}
