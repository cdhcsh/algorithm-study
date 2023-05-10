package study.algorithm.backjoon;

/**
 * 적록색약
 */

import java.io.*;

public class B10026 {
    enum Color{
        R(2),
        G(1),
        B(0);

        final int value;

        Color(int value) {
            this.value = value;
        }
    }
    static int[][] map;
    static boolean[][] visit;
    static int N;
    static int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = getValue(String.valueOf(str.charAt(j)));
            }
        }

        bw.write(solve((c,v)->c==v)+" "); //일반
        bw.write(solve((c,v)->(c > 0 ? v > 0 : v == 0))+""); // 적록
        bw.close();
    }
    static int solve(CheckFunction func){
        int answer = 0;
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!visit[i][j]){
                    answer++;
                    int color = map[i][j];
                    dfs(i, j, color, func);
                }
            }
        }
        return answer;
    }
    static void dfs(int x, int y , int color, CheckFunction func){
        if(x < 0 || x >= N || y < 0 || y >= N) return;
        if(visit[x][y]) return;
        if(func.check(color,map[x][y])){
            visit[x][y] = true;
            for (int[] d : directions) {
                dfs(x + d[0], y + d[1],color,func);
            }
        }
    }
    static int getValue(String color){
        return Color.valueOf(color).value;
    }
    @FunctionalInterface
    static interface CheckFunction {
        boolean check(int color,int v);
    }

}
