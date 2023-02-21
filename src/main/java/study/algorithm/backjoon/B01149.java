package study.algorithm.backjoon;

/**
 * RGB거리
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01149 {
    static int[][] houses;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        houses = new int[n][3];
        for (int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                houses[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                houses[i][j] = Math.min(houses[i-1][(j+1)%3],houses[i-1][(j+2)%3])+houses[i][j];
            }
        }
        int answer = Math.min(houses[n-1][0],Math.min(houses[n-1][1],houses[n-1][2]));
        bw.write(answer+"");
        bw.close();
    }
}
