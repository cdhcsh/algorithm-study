package study.algorithm.programmers;

/**
 * 무인도 여행
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0081 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P0081().solution(new String[]{"X591X", "X1X5X", "X231X", "1XXX1"})));
    }
    public int[] solution(String[] maps) {
        int m = maps.length;
        int n = maps[0].length();
        int[][] visit = new int[m][n];
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(maps[i].charAt(j) != 'X' && visit[i][j]==0){
                    int k = dfs(i,j,maps,visit);
                    answer.add(k);
                }
            }
        }
        if(answer.size() == 0) return new int[]{-1};
        else{
            return answer.stream().sorted().mapToInt(i->i).toArray();
        }
    }
    public int dfs(int x,int y,String[] maps,int[][] visit){
        if(x < 0 || x >= maps.length || y < 0 || y >= maps[0].length()) return 0;
        if(maps[x].charAt(y) == 'X' || visit[x][y] > 0) return 0;
        visit[x][y]= 1;
        int count = maps[x].charAt(y)-'0';
        count += dfs(x,y-1,maps,visit);
        count += dfs(x,y+1,maps,visit);
        count += dfs(x+1,y,maps,visit);
        count += dfs(x-1,y,maps,visit);
        return count;
    }
}
