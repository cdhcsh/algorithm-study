package study.algorithm.backjoon;

/**
 * 정수 a를 k로 만들기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B25418 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[k+1];
        Arrays.fill(dp,k-a);

        dp[k] = 0;
        for (int i = k; i >= a; i--) {
            if(i%2==0) dp[i/2] = Math.min(dp[i/2],dp[i]+1);
            dp[i-1] = Math.min(dp[i-1],dp[i]+1);
        }

        System.out.println(dp[a]);
    }
}
