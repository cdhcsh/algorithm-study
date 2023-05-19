package study.algorithm;

/**
 * 동전 1
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[k+1];
        for (int i = 0; i < n; i++) {
            int coin = Integer.parseInt(br.readLine());
            for (int j = 1; j <= k ; j++) {
                int cha = j - coin;
                if((cha) == 0){
                    dp[j]++;
                }
                else if(cha > 0){
                    dp[j] = dp[j] + dp[cha];
                }
            }
        }
        System.out.println(dp[k]);
    }
}
