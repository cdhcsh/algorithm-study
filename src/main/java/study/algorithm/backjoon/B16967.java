package study.algorithm.backjoon;

/**
 * 배열 복원하기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B16967 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] B = new int[h + x][w + y];
        int[][] A = new int[h][w];

        for (int i = 0; i < h + x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w + y; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < w; j++) {
                A[i][j] = B[i][j];
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                A[i][j] = B[i][j];
            }
        }
        for (int i = x; i < h; i++) {
            for (int j = y; j < w; j++) {
                A[i][j] = B[i][j] - A[i - x][j - y];
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                bw.write(A[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
