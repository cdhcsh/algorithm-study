package study.algorithm.backjoon;

/**
 * 연속합
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] d = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        d[0] = arr[0];
        int max = arr[0];
        for (int i = 1 ; i < n; i++) {
            d[i] = Math.max(d[i-1]+arr[i],arr[i]);
            max = Math.max(d[i],max);
        }
        bw.write(max+"");
        bw.close();
                
    }
}
