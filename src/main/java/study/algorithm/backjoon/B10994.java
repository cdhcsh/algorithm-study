package study.algorithm.backjoon;

/**
 * 별 찍기 - 19
 */

import java.io.*;

public class B10994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int length = (n-1)*4+1;
        boolean[][] map = new boolean[length][length];
        draw(n,map,length);
        for (boolean[] b : map) {
            for (boolean i : b) {
                if(i)bw.write("*");
                else bw.write(" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
    static void draw(int n,boolean[][] map,int length){
        int mid = length/2;
        int start = mid - (n-1)*2;
        int end = mid + (n-1)*2;
        for (int i = start; i <= end; i++) {
            map[start][i] = true;
            map[end][i] = true;
            map[i][start] = true;
            map[i][end] = true;
        }
        if(n > 1) draw(n-1,map,length);
    }

}
