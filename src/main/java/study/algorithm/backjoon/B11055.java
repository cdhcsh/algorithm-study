package study.algorithm.backjoon;

/**
 * 가장 큰 증가하는 부분 수열
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        int answer = arr[0];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = arr[i];
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[j] + arr[i],dp[i]);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);



    }
}
