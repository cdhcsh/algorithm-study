package study.algorithm.backjoon;

/**
 * 색종이 만들기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02630 {
    static int N;
    static boolean[][] map;
    static int white = 0;
    static int blue = 0;
    static int[][] d = {{0,0},{0,1},{1,0},{1,1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        map = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = st.nextToken().equals("1");
            }
        }
        find(0,0,N);
        System.out.println(white);
        System.out.println(blue);
    }
    static void find(int x,int y,int w){
        if(match(x,y,w)){
            count(x,y);
            return;
        }
        w/=2;
        for (int i = 0; i < 4; i++) {
            find(x+d[i][0]*w,y+d[i][1]*w,w);
        }
    }
    static void count(int x,int y){
        if(map[x][y]) blue++;
        else white++;
    }
    static boolean match(int x,int y,int w){
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {
                if(map[x+i][y+j]!=map[x][y]) return false;
            }
        }
        return true;
    }
}
