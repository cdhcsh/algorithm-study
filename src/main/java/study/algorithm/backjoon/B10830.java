package study.algorithm.backjoon;

/**
 * 행렬 제곱
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10830 {
    static int N;
    static int[][] base;
    static int[][] defaultBase;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        base = new int[N][N];
        defaultBase = new int[N][N];
        for (int i = 0; i < N; i++) {
            defaultBase[i][i] = 1;
        }
        long m = Long.parseLong(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                base[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] result = solve(m);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(result[i][j]+ " ");
            }
            bw.write("\n");
        }
        bw.close();
    }

    public static int[][] solve(long m) {
        int[][] target;
        if (m == 0) return defaultBase;
        target = multi(solve(m / 2));
        if (m % 2 == 1){
            target = multi(target, base);
        }
        return target;
    }

    public static int[][] multi(int[][] a) {
        return multi(a, a);
    }

    public static int[][] multi(int[][] a, int[][] b) {
        int[][] temp = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    temp[i][j] += a[i][k] * b[k][j];
                }
                temp[i][j]%=1000;
            }
        }
        return temp;
    }
}
