package study.algorithm.backjoon;

/**
 * 약수
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int min = Integer.MAX_VALUE;
        int max = 0;
        int length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int n = Integer.parseInt(st.nextToken());
            max = Math.max(n,max);
            min = Math.min(n,min);
        }
        bw.write(max*min+"");
        bw.close();


    }
}
