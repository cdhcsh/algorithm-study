package study.algorithm.backjoon;

/**
 * 1로 만들기
 */

import java.io.*;
import java.util.Arrays;

public class B01463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int[] dp = new int[X+1];
        Arrays.fill(dp,X);
        dp[X] = 0;
        for (int i = X; i > 1; i--) {
            if(i%2==0) update(dp,i,i/2);
            if(i%3==0) update(dp,i,i/3);
            update(dp,i,i-1);
        }
        bw.write(dp[1]+"");
        bw.close();
    }
    static void update(int[] arr,int from, int to){
        arr[to] = Math.min(arr[from]+1,arr[to]);
    }
}
