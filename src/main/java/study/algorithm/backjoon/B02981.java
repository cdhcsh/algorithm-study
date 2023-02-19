package study.algorithm.backjoon;

/**
 * 검문
 */

import java.io.*;
import java.util.Arrays;

public class B02981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int gcd = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            gcd = getGcd(gcd, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= gcd; i++) {
            if (gcd % i == 0) {
                bw.write(i + " ");
            }
        }
        bw.close();

    }    // 최대공약수 함수
    static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
