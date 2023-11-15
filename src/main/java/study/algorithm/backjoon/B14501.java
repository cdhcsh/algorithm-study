package study.algorithm.backjoon;

/**
 * 퇴사
 */

import java.io.*;
import java.util.StringTokenizer;

public class B14501 {
    static int N;
    static int[] T;
    static int[] P;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        T = new int[N];
        P = new int[N];
        int[] dp = new int[N+1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            if(i + T[i] <= N){
                dp[i+T[i]] = Math.max(dp[i+T[i]],dp[i]+P[i]);
            }
            dp[i+1] = Math.max(dp[i+1],dp[i]);
        }
        System.out.println(dp[N]);


    }
}
