package study.algorithm.backjoon;

/**
 * 스타트와 링크
 */

import java.io.*;
import java.util.StringTokenizer;

public class B14889 {
    static boolean[] visit;
    static int[][] stats;
    static int N;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        N = n / 2;
        visit = new boolean[n];
        stats = new int[n][n];
        for (int i = 0; i < stats.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < stats[i].length; j++) {
                stats[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        bw.write(min + "");
        bw.close();
    }

    static void dfs(int n, int a) {
        if (n == N) {
            min = Math.min(getScore(), min);
            return;
        }
        for (int i = a; i < N * 2; i++) {
            visit[i] = true;
            dfs(n + 1, i + 1);
            visit[i] = false;
        }
    }

    static int getScore() {
        int result = 0;
        for (int i = 0; i < N * 2 - 1; i++) {
            for (int j = i + 1; j < N * 2; j++) {
                int temp = stats[i][j] + stats[j][i];
                if (visit[i] && visit[j]) {
                    result += temp;
                } else if ((!visit[i]) && (!visit[j])) {
                    result -= temp;
                }
            }
        }
        return Math.abs(result);

    }
}
