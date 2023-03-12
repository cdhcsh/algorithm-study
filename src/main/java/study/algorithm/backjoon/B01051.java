package study.algorithm.backjoon;

/**
 * 숫자 정사각형
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }
        bw.write(solve(n, m, map) + "");
        bw.close();
    }

    static int solve(int n, int m, int[][] map) {
        int l = Math.min(n, m);
        int answer = 1;
        while (l > 1) {
            for (int i = 0; i <= n - l; i++)
                for (int j = 0; j <= m - l; j++) {
                    int p = map[i][j];
                    if (p == map[i][j + l - 1] &&
                            p == map[i + l - 1][j] &&
                            p == map[i + l - 1][j + l - 1])
                        return l * l;
                }
            l--;
        }
        return answer;
    }
}
