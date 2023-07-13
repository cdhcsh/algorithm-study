package study.algorithm.backjoon;

/**
 * 2차원 배열의 합
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][M+1];
        int[][] dp = new int[N+1][M+1];


        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = arr[i][j] + dp[i][j-1];
            }
        }

        int k = Integer.parseInt(br.readLine());
        for (; k > 0; k--) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int answer = 0;
            for (int row = i; row <= x; row++) {
                answer+= dp[row][y] - dp[row][j-1];
            }
            bw.write(answer+"\n");
        }
        bw.close();
    }
}
