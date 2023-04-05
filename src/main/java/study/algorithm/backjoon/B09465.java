package study.algorithm.backjoon;

/**
 * 스티커
 */

import java.io.*;
import java.util.StringTokenizer;

public class B09465 {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String args[]) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tests = Integer.parseInt(br.readLine());
        for (int t = 0 ; t < tests ; t++) {
            bw.write(sticker(Integer.parseInt(br.readLine()))+"\n");
        }
        bw.close();
    }
    static int sticker(int n ) throws IOException {
        int dp[][] = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                dp[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][1] + dp[i][0],dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0] + dp[i][1],dp[i-1][1]);
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}
