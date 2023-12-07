package study.algorithm.backjoon;

/**
 * 주식
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            bw.write(solve(n, st) + "\n");
        }
        bw.close();
    }

    public static long solve(int n, StringTokenizer st) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        long answer = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < max) {
                answer += (max - arr[i]);
            }
            else max = arr[i];
        }
        return answer;
    }

}
