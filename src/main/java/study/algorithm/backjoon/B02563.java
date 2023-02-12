package study.algorithm.backjoon;

/**
 * 색종이
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int MAX_HEIGHT = 100;
        final int MAX_WIDTH = 100;
        final int PAPER_HEIGHT = 10;
        final int PAPER_WIDTH = 10;
        int[][] paper = new int[MAX_HEIGHT][MAX_WIDTH];
        int c = Integer.parseInt(st.nextToken());
        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = 0; j < PAPER_HEIGHT; j++) {
                for (int k = 0; k < PAPER_WIDTH; k++) {
                    paper[j+y][k+x]++;
                }
            }
        }
        int answer = 0;
        for (int[] p : paper) {
            for (int p2 : p) {
                if(p2 > 0) answer++;
            }
        }
        bw.write(answer+"");
        bw.close();
    }
}
