package study.algorithm.backjoon;

/**
 * 유기농 배추
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01012 {
    static int N = 0;
    static int[][] map;
    static int[][] targets;
    static int[][] d = {{0,-1},{0,1},{-1,0},{1,0}};
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        for (int len = 0; len < length; len++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            N = Integer.parseInt(st.nextToken());
            targets = new int[N][2];
            map = new int[h][w];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
                targets[i][0] = x;
                targets[i][1] = y;
            }

            for (int[] target : targets) {
                int x = target[0];
                int y = target[1];
                if (map[x][y] == 1) {
                    result++;
                    dfs(x, y);
                }
            }
            bw.write(result+"\n");
        }
        bw.close();
    }
    static void dfs(int x,int y){
        if((x < 0) || (x >= map.length) ||
                (y < 0) || (y >= map[0].length)){
            return;
        }
        if(map[x][y] == 0 ) return;
        map[x][y]  =  0;
        for (int i = 0; i < 4; i++) {
            dfs(x+d[i][0],y+d[i][1]);
        }
    }
}
