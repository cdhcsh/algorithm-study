package study.algorithm.backjoon;

/**
 * 보물
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += a[i] * b[n - i - 1];
        }
        bw.write(answer + "");
        bw.close();


    }
}
