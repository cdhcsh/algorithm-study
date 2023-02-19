package study.algorithm.backjoon;

/**
 * 링
 */

import java.io.*;
import java.util.StringTokenizer;

public class B03036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int first;
        int last;
        int gcd;
        for (int i = 1; i < n; i++) {
            first = arr[0];
            last = arr[i];
            gcd = getGcd(first, last);
            first /= gcd;
            last /= gcd;
            bw.write(first + "/" + last + "\n");
        }
        bw.close();
    }

    static int getGcd(int a, int b) {
        int n = Math.max(a, b);
        int m = Math.min(a, b);
        while (m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}
