package study.algorithm.backjoon;

/**
 * 부녀회장이 될테야
 */

import java.io.*;

public class B02775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(getMans(k,n)+"\n");
        }
        bw.close();


    }
    static int getMans(int h,int w){
        int map[][] = new int[h+1][w];
        for (int i = 0; i < w; i++) {
            map[0][i] = i+1;
        }
        for(int i = 1 ; i <= h ; i++){
            for (int j = 0; j < w; j++) {
                map[i][j] = map[i-1][j];
                if(j > 0) map[i][j] += map[i][j-1];
            }
        }
        return map[h][w-1];
    }
}
