package study.algorithm.backjoon;

/**
 * 가장 긴 증가하는 부분 수열
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        for(int i : dp){
            max = Math.max(max,i);
        }
        bw.write(max+"");
        bw.close();

    }
}
