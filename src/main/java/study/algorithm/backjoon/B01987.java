package study.algorithm.backjoon;

/**
 * 알파벳
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01987 {
    static int R, C;
    static int[][] map;
    static boolean[] visit = new boolean[26];
    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new int[R][C];
        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) map[i][j] = (s.charAt(j) - 'A');
        }
        bw.write(dfs(1,0,0)+"");
        bw.close();

    }

    static int dfs(int n, int x, int y) {
        if (x < 0 || x >= R || y < 0 || y >= C)
            return n - 1;
        int c = map[x][y];
        if (visit[c])
            return n - 1;
        visit[c] = true;
        int max = n;
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, dfs(n + 1, x + d[i][0], y + d[i][1]));
        }
        visit[c] = false;
        return max;
    }
}
