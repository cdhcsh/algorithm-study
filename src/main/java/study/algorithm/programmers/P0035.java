package study.algorithm.programmers;

/**
 * 카카오프렌즈 컬러링북
 */

import java.util.Arrays;

public class P0035 {
    public static void start() {
        P0035 obj = new P0035();
        int[] result = obj.solution(6,4
                ,new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}});
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int m, int n, int[][] picture) {
        int[][] visit = new int[m][n];
        int[] answer = new int[2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(picture[i][j]>0 && visit[i][j]==0){
                    int k = dfs(i,j,picture[i][j],picture,visit);
                    answer[0]++;
                    answer[1] = Math.max(answer[1],k);
                }
            }
        }
        return answer;
    }
    public int dfs(int x,int y,int color,int[][] picture,int[][] visit){
        if(x < 0 || x >= picture.length || y < 0 || y >= picture[0].length) return 0;
        if(picture[x][y]!=color || visit[x][y] > 0) return 0;
        visit[x][y]= 1;
        int count = 1;
        count += dfs(x,y-1,color,picture,visit);
        count += dfs(x,y+1,color,picture,visit);
        count += dfs(x+1,y,color,picture,visit);
        count += dfs(x-1,y,color,picture,visit);
        return count;
    }
}
