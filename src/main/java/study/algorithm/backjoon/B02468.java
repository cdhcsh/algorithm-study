package study.algorithm.backjoon;

/**
 * 안전 영역
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02468 {
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    static int answer = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int max = 1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(map[i][j], max);
            }
        }
        for (int height = 1; height < max; height++) {
            int count = 0;
            visit = new boolean[N][N];
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if(!visit[x][y] && map[x][y] > height) {
                        dfs(x,y,height);
                        count++;
                    }
                }
            }
            answer = Math.max(count, answer);
        }
        System.out.println(answer);
    }
    public static void dfs(int x,int y,int h){
        if(x < 0 || x >= N || y < 0 || y >= N) return;
        if(visit[x][y] || map[x][y] <= h) return;
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            dfs(x+d[i][0],y+d[i][1],h);
        }
    }
}
