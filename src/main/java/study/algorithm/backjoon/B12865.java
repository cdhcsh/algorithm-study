package study.algorithm.backjoon;

/**
 * 평범한 배낭
 */

import java.io.*;
import java.util.StringTokenizer;

public class B12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());
        int[][] item = new int[length+1][2];
        int[][] dp = new int[length+1][maxWeight+1];
        for (int i = 1; i <= length; i++) {
            st = new StringTokenizer(br.readLine());
            item[i][0] = Integer.parseInt(st.nextToken());
            item[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1 ; i <= length ; i++){
            for (int j = 1; j <= maxWeight; j++) {
                dp[i][j] = dp[i-1][j];
                if(j >= item[i][0]){
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-item[i][0]]+item[i][1]);
                }
            }
        }
        bw.write(dp[length][maxWeight]+"");
        bw.close();



    }

}
