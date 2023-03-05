package study.algorithm.backjoon;

/**
 * 특별상이라도 받고 싶어
 */

import java.io.*;
import java.util.StringTokenizer;

public class B24460 {
    static int[][] map;
    static int[][] d = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bw.write(solve(n,0,0)+"");
        bw.close();
        br.close();


    }

    static int solve(int n, int x, int y) {
        if (n == 1) return map[x][y]; // unit
        int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        int m = n / 2;
        for (int[] a : d) { // merge
            int t = solve(m, x + a[0] * m, y + a[1] * m);

            if (t < min1) {
                min2 = min1;
                min1 = t;
            }
            else if (t < min2) min2 = t;
        }
        return min2;
    }
}
