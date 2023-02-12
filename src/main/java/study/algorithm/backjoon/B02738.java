package study.algorithm.backjoon;

/**
 * 행렬 덧셈
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] a = new int[h][w];
        int[][] b = new int[h][w];
        inputArr(h, w, br, a);
        inputArr(h, w, br, b);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                bw.write((a[i][j] + b[i][j]) +" ");
            }
            bw.write("\n");
        }
        bw.close();

    }

    private static void inputArr(int h, int w, BufferedReader br, int[][] arr) throws IOException {
        for (int i = 0; i < h; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
