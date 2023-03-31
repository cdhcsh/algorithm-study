package study.algorithm.backjoon;

/**
 * 쿠키의 신체 측정
 */

import java.io.*;

public class B20125 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        int[] xCount = new int[n];
        int[] yCount = new int[n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == '_') map[i][j] = 0;
                else {
                    map[i][j] = 1;
                    if (xCount[i] == 0 || map[i][j - 1] == 1) xCount[i]++;
                    if (yCount[i] == 0 || map[i - 1][j] == 1) yCount[j]++;
                }
            }
        }
        int heartX = 0;
        int heartY = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (map[i - 1][j] == 1
                        && map[i + 1][j] == 1
                        && map[i][j - 1] == 1
                        && map[i][j + 1] == 1) {
                    heartX = i;
                    heartY = j;
                }

            }
        }

        int lHand = 0;
        int rhand = 0;
        for (int i = 0; i < n; i++) {
            if (map[heartX][i] == 1) {
                lHand = heartY - i;
                rhand = xCount[heartX] - lHand - 1;
                break;
            }
        }
        int mid = yCount[heartY] - 2;
        int lLeg = yCount[heartY - 1];
        int rLeg = yCount[heartY + 1];

        System.out.println(
                (heartX + 1) + " "
                        + (heartY + 1) + "\n"
                        + lHand + " "
                        + rhand + " "
                        + mid + " "
                        + lLeg + " "
                        + rLeg);
    }
}
