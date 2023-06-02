package study.algorithm;

/**
 * 가장 긴 바이토닉 부분 수열
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp1[0] = 1;
        for (int i = 1; i < n; i++) {
            dp1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp1[i] <= dp1[j]) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }

        dp2[0] = 1;
        for (int i = n - 1; i >= 0; i--) {
            dp2[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i] && dp2[i] <= dp2[j]) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            int tmp = dp1[i] + dp2[i] - 1;
            max = Math.max(max, tmp);
        }
        System.out.println(max);
    }
}
