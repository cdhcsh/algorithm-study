package study.algorithm.backjoon;

/**
 * 민균이의 계략
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] dp = new int[N];
        int answer = 1;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
            for (int j = 0; j < i; j++)
                if(arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}
