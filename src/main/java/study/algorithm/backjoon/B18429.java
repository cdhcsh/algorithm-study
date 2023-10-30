package study.algorithm.backjoon;

/**
 * 근손실
 */

import java.io.*;
import java.util.StringTokenizer;

public class B18429 {
    static int N;
    static int K;
    static int[] kits;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        kits = new int[N];
        check = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            kits[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solve(0, 0));


    }

    static int solve(int n, int m) {
        if (n == N)
            return 1;
        int r = 0;
        for (int i = 0; i < N; i++) {
            int t = m - K + kits[i];
            if (!check[i] && t >= 0) {
                check[i] = true;
                r += solve(n + 1, t);
                check[i] = false;
            }
        }
        return r;
    }
}
