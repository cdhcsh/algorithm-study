package study.algorithm.backjoon;

/**
 * 꽃길
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14620 {
    static int[][] map;
    static boolean[][] visit;
    static int N;
    static int answer = Integer.MAX_VALUE;
    static int[][] d = {{0, 0}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(answer);
    }

    static void dfs(int n, int price) {
        if (n == 3) {
            answer = Math.min(answer, price);
            return;
        }

        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                if (isFlowerAble(i, j)) {
                    setBoolean(i, j, true);
                    dfs(n + 1, price + getPrice(i, j));
                    setBoolean(i, j, false);
                }
            }
        }
    }

    static void setBoolean(int x, int y, boolean bool) {
        for (int i = 0; i < 5; i++) {
            int tx = x + d[i][0];
            int ty = y + d[i][1];

            visit[tx][ty] = bool;
        }
    }

    static boolean isFlowerAble(int x, int y) {
         for (int i = 0; i < 5; i++) {
            int tx = x + d[i][0];
            int ty = y + d[i][1];
            if (visit[tx][ty])
                return false;
        }
        return true;
    }

    static int getPrice(int x, int y) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int tx = x + d[i][0];
            int ty = y + d[i][1];

            sum += map[tx][ty];
        }
        return sum;
    }
}
