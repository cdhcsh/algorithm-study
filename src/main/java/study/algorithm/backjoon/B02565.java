package study.algorithm.backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B02565 {
    static int N ;
    static int[][] ele;
    static int[] dp;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());;

        ele = new int[N][2];
        dp = new int[N];

        for(int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            ele[i][0]=Integer.parseInt(st.nextToken());
            ele[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ele, Comparator.comparingInt(i -> i[0]));

        for(int i = 0 ; i < N ; i ++) {
            max = Math.max(electronic(i), max);
        }

        bw.write(N-max+"");
        bw.close();
    }
    static int electronic(int num) {
        if(dp[num]==0) {
            dp[num]=1;

            for(int i = num+1 ; i < dp.length ; i ++) {
                if(ele[num][1] < ele[i][1])
                    dp[num]=Math.max(dp[num], electronic(i)+1);
            }
        }

        return dp[num];
    }

}