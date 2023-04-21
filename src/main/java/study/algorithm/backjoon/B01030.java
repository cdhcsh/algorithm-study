package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B01030 {
    static int S;
    static int N;
    static int K;
    static int r1;
    static int r2;
    static int c1;
    static int c2;

    static boolean[][] fractal;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        r1 = Integer.parseInt(st.nextToken());
        r2 = Integer.parseInt(st.nextToken());
        c1 = Integer.parseInt(st.nextToken());
        c2 = Integer.parseInt(st.nextToken());

        int len = (int) Math.pow(N, S);
        fractal = new boolean[len][len];

        solve(0, 0, 1);
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                int num = fractal[i][j] ? 1 : 0;
                bw.write(num + "");
            }
            bw.write("\n");
        }
        bw.close();
    }

    static void solve(int x, int y, int s) {
        if (s == 0) return;
        if (s > S) return;
        int min = N / 2 - K / 2;
        int max = N / 2 + K / 2;
        if (N % 2 == 0) max--;
        int size = (int) Math.pow(N, S - s);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tx = i * size + x;
                int ty = j * size + y;
                if ((min <= i && max >= i) &&
                        (min <= j && max >= j)) {
                    fill(tx, ty, size);
                } else
                    solve(tx, ty, s + 1);
            }
        }
    }


    static void fill(int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                fractal[i][j] = true;
            }
        }
    }
}
