package study.algorithm.backjoon;

/**
 * 포도주 시식
 */

import java.io.*;

public class B02156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[Math.max(n,3)];
        int[] dp = new int[Math.max(n,3)];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(Math.max(arr[0],arr[1])+arr[2],dp[1]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(Math.max(dp[i-3]+arr[i-1],dp[i-2])+arr[i],dp[i-1]);
        }
        bw.write(dp[n-1]+"");
        bw.close();

    }
}
