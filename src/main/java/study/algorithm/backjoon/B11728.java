package study.algorithm.backjoon;

/**
 * 배열 합치기
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n  = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+m];
        int c = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[c++] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[c++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int i : arr) {
            bw.write(i+" ");
        }
        bw.close();
    }

}
