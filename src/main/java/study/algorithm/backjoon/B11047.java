package study.algorithm.backjoon;

/**
 * 동전 0
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int answer = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer += k / arr[i];
            k = k % arr[i];
        }
        bw.write(answer+"");
        bw.close();
        br.close();
    }

}
