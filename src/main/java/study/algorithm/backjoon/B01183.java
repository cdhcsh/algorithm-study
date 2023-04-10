package study.algorithm.backjoon;

/**
 * 약속
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01183 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer;
        if (n % 2 == 1) answer = 1;
        else answer = Math.abs(arr[n / 2] - arr[n / 2 - 1]) + 1;
        System.out.println(answer);

    }
}
