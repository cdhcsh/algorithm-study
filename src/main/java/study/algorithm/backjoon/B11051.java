package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 이항 계수 2
 */

public class B11051 {
    static int[][] dp;
    public static final int div = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];

        bw.write(BC(N,K));
        bw.close();

    }

    static int BC(int n, int k) {

        // 이미 풀었던 sub문제일 경우 값을 재활용
        if (dp[n][k] > 0) {
            return dp[n][k];
        }

        if (k == 0 || n == k) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k)) % div;
    }

}
