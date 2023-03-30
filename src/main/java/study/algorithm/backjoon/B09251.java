package study.algorithm.backjoon;

/**
 * LCS
 */

import java.io.*;
import java.util.Arrays;

public class B09251 {
    static int[][] dp;
    static char[] s1;
    static char[] s2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        s1 = br.readLine().toCharArray();
        s2 = br.readLine().toCharArray();

        dp = new int[s1.length][s2.length];
        for (int[] arr : dp) {
            Arrays.fill(arr,-1);
        }
        System.out.println(lcs(s1.length-1,s2.length-1));



    }
    static int lcs(int x,int y){
        if(x < 0 || y < 0)
            return 0;
        if(dp[x][y] < 0){
            dp[x][y] = 0;
            if(s1[x] == s2[y])
                dp[x][y] = lcs(x-1,y-1)+1;
            else
                dp[x][y] = Math.max(lcs(x-1,y),lcs(x,y-1));
        }
        return dp[x][y];
    }
}
