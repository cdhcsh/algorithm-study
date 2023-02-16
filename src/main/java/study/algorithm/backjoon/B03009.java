package study.algorithm.backjoon;

/**
 * 네 번째 점
 */

import java.io.*;
import java.util.StringTokenizer;

public class B03009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] xs = new int[2][2];
        int[][] ys = new int[2][2];

        int rx=0;
        int yr=0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            countPoints(xs, x);
            countPoints(ys, y);
        }
        for (int i = 0; i < 2; i++) {
            if(xs[i][1]==1) rx = xs[i][0];
            if(ys[i][1]==1) yr = ys[i][0];
        }
        bw.write(rx+" "+yr);
        bw.close();
    }

    private static void countPoints(int[][] arr, int n) {
        int i = 0;
        if (arr[i][0] > 0 && arr[i][0] != n)
            i = (i + 1) % 2;
        arr[i][0] = n;
        arr[i][1]++;
    }
}
