package study.algorithm.backjoon;

/**
 * 연구소
 */

import java.io.*;
import java.util.StringTokenizer;

public class B14502 {
    static int[][] map;
    static int H;
    static int W;
    static int N = 3;

    static int[][] targets;
    static int T = 0;
    static int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static int max = 0;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        map = new int[H][W];
        targets = new int[H * W][2];
        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) {
                    targets[T][0] = i;
                    targets[T++][1] = j;
                }
            }
        }
        dfs_targets(0);
        bw.write(max + "");
        bw.close();
    }

    static void dfs_targets(int n) {
        if (n == N) {
            max = Math.max(diff(),max);
            return;
        }
        for (int[] target : targets) {
            int x = target[0];
            int y = target[1];
            if (map[x][y] == 0) {
                map[x][y] = 1;
                dfs_targets(n + 1);
                map[x][y] = 0;
            }
        }
    }
    static int diff() {
        boolean[][] visit = new boolean[H][W];
        int sum = 0;
        for (int i = 0; i < T; i++) {
            int x = targets[i][0];
            int y = targets[i][1];
            if (map[x][y] == 0 && !visit[x][y]) {
                int tmp = dfs_map(visit, x, y);
                if (tmp > 0) {
                    sum += tmp;
                }
            }
        }
        return sum;
    }
    static int dfs_map(boolean[][] visit, int x, int y) {
        if (x < 0 || x >= H || y < 0 || y >= W) return 0;
        if (map[x][y] == 2) return -1;
        if (map[x][y] == 1) return 0;
        if (visit[x][y]) return 0;
        visit[x][y] = true;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            int tmp = dfs_map(visit, x + d[i][0], y + d[i][1]);
            if (tmp < 0) {
                cnt = -1;
            } else if (cnt >= 0) {
                cnt += tmp;
            }
        }
        return cnt;
    }
}
