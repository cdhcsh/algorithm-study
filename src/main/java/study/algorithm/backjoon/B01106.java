package study.algorithm.backjoon;

/**
 * 호텔
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01106 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int answer = 100000000;
        int[] dp = new int[C + 101];
        Arrays.fill(dp, 100000000);
        dp[0] = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());
            for (int j = people; j < C + 101; j++) {
                dp[j] = Math.min(dp[j], cost + dp[j - people]);
            }
        }
        for (int i = C; i < C+101; i++) {
            answer = Math.min(dp[i], answer);
        }
        System.out.println(answer);

    }
}
