package study.algorithm.backjoon;

/**
 * 설탕 배달
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[5001];
        cnt[3] = 1;
        cnt[5] = 1;
        for(int i = 6; i <= n ; i++){
            boolean three = cnt[i-3] <= 0;
            boolean five = cnt[i-5] <= 0;
            if(three&&five) cnt[i] = 0;
            else if(three) cnt[i] = cnt[i-5]+1;
            else if(five) cnt[i] = cnt[i-3]+1;
            else cnt[i] = Math.min(cnt[i-3],cnt[i-5])+1;
        }
        bw.write((cnt[n]>0 ? cnt[n] : -1)+"");
        bw.close();
    }
}
