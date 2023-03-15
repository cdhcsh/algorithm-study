package study.algorithm.backjoon;

/**
 * 소가 길을 건너간 이유 3
 */

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B14469 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] cow = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            cow[i][0] = Integer.parseInt(st.nextToken());
            cow[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cow, Comparator.comparingInt(i -> i[0]));
        int c = 0;
        int answer = 0;
        while (c < n) {
            int[] p = cow[c];
            answer = Math.max(p[0],answer);
            answer += p[1];
            c++;
        }
        System.out.println(answer);
    }
}
