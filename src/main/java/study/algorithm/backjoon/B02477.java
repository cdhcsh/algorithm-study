package study.algorithm.backjoon;

/**
 * 참외밭
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        int[][] rectangle = new int[6][2];
        int maxX = 0;
        int maxY = 0;
        int minX = 0;
        int minY = 0;
        int maxXIndex = 0;
        int maxYIndex = 0;
        for (int i = 0; i < rectangle.length; i++) {
            st = new StringTokenizer(br.readLine());
            rectangle[i][0] = Integer.parseInt(st.nextToken());
            rectangle[i][1] = Integer.parseInt(st.nextToken());
            if (rectangle[i][0] <=2 && rectangle[i][1] > maxX) {
                maxX = rectangle[i][1];
                maxXIndex = i;
            }
            if (rectangle[i][0] >= 3 && rectangle[i][1] > maxY) {
                maxY = rectangle[i][1];
                maxYIndex = i;
            }
        }

        int t1 = (maxXIndex + 1) % rectangle.length;
        int t2 = (maxXIndex + 5) % rectangle.length;
        minY = maxY - (rectangle[t1][1] == maxY ? rectangle[t2][1] : rectangle[t1][1]);

        t1 = (maxYIndex + 1) % rectangle.length;
        t2 = (maxYIndex + 5) % rectangle.length;
        minX = maxX - (rectangle[t1][1] == maxX ? rectangle[t2][1] : rectangle[t1][1]);

        bw.write((maxX*maxY-minX*minY)*k + "");
        bw.close();


    }
}
