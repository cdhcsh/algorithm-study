package study.algorithm.backjoon;

/**
 * 기타리스트
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01495 {
    static int N;
    static int S;
    static int M;
    static int[] volume;
    static boolean[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        volume = new int[N + 1];
        dp = new boolean[N + 1][M + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            volume[i + 1] = Integer.parseInt(st.nextToken());
        }
        dp[0][S] = true;

        for (int i = 1; i <= N; i++) {
            for (int v = 0; v <= M; v++) {
                if (dp[i - 1][v]) {
                    if (v + volume[i] <= M) {
                        dp[i][v + volume[i]] = true;
                    }
                    if (v - volume[i] >= 0) {
                        dp[i][v - volume[i]] = true;
                    }
                }
            }
        }
        int answer = -1;
        for (int i = M; i >= 0; i--) {
            if (dp[N][i]) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}
