package study.algorithm.backjoon;

/**
 * 별 찍기 -11
 */

import java.io.*;

public class B02448 {
    static boolean[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        map = new boolean[n][2*n-1];
        draw(n,0,0);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j])bw.write("*");
                else bw.write(" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
    static void draw(int n,int x,int y){
        int midX = x+ n/2;
        int midY = y+ n-1;
        if(n == 1){
            map[x][y] = true;
        }
        else if(n == 3){
            map[x][midY] = true;
            map[midX][midY-1] = true;
            map[midX][midY+1] = true;
            for (int i = 0; i < 5; i++) {
                map[x+2][y+i] = true;
            }
        }
        else{
            draw(n/2,x,y+n/2);
            draw(n/2,midX,y);
            draw(n/2,midX,midY+1);
        }
    }
}
