package study.algorithm.backjoon;

/**
 *꽃길
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14620 {
    static int[][] map;
    static boolean[][] visit;
    static int n;
    static int answer = Integer.MAX_VALUE;
    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(answer);
    }

    static void dfs(int depth, int sum) {
        if (depth == 3) {
            answer = Math.min(answer, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isFlowerAble(i, j)) {
                    int temp = getPrice(i, j);
                    visit[i][j] = true;
                    for (int k = 0; k < 4; k++) {
                        int tx = i + d[k][0];
                        int ty = j + d[k][1];

                        visit[tx][ty] = true;
                    }

                    dfs(depth + 1, sum + temp);

                    visit[i][j] = false;
                    for (int k = 0; k < 4; k++) {
                        int tx = i + d[k][0];
                        int ty = j + d[k][1];

                        visit[tx][ty] = false;
                    }
                }
            }
        }
    }

    static boolean isFlowerAble(int x, int y) {
        if (visit[x][y] == true)
            return false;

        for (int i = 0; i < 4; i++) {
            int tx = x + d[i][0];
            int ty = y + d[i][1];
            if (tx >= n || ty >= n || tx < 0 || ty < 0)
                return false;
            if (visit[tx][ty])
                return false;
        }
        return true;
    }

    static int getPrice(int x, int y) {
        int sum = map[x][y];

        for (int k = 0; k < 4; k++) {
            int tx = x + d[k][0];
            int ty = y + d[k][1];

            sum += map[tx][ty];
        }
        return sum;
    }
}
