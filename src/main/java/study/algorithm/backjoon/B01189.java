package study.algorithm.backjoon;

/**
 * 컴백홈
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01189 {
    static int R;
    static int C;
    static int K;

    final static int[][] D = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    static boolean map[][];
    static boolean visit[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new boolean[R][C];
        visit = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                map[i][j] = s[j] == '.';
            }
        }
        System.out.println(solve(R-1,0,1));


    }

    public static int solve(int x, int y, int distance) {
        if (x == 0 && y == C - 1) {
            if (distance == K) return 1;
            else return 0;
        }
        int result = 0;
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int dx = x + D[i][0];
            int dy = y + D[i][1];
            if (isInRange(dx, dy) && map[dx][dy] && !visit[dx][dy])
                result+=solve(dx,dy,distance+1);
        }
        visit[x][y] = false;
        return result;
    }

    public static boolean isInRange(int dx, int dy) {
        return dx >= 0 && dx < R && dy >= 0 && dy < C;
    }
}
