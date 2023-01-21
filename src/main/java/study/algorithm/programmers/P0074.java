package study.algorithm.programmers;

/**
 * 피로도
 */
public class P0074 {
    public int solution(int k, int[][] dungeons) {
        int[] visit = new int[dungeons.length];
        return dfs(k, 0, dungeons, visit);
    }

    public int dfs(int k, int n, int[][] dungeons, int[] visit) {
        int max = n;
        for (int i = 0; i < dungeons.length; i++) {
            if (visit[i] == 0 && k >= dungeons[i][0]) {
                visit[i] = 1;
                max = Math.max(max, dfs(k - dungeons[i][1], n + 1, dungeons, visit));
                visit[i] = 0;
            }
        }
        return max;
    }
}
