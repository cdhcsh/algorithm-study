package study.algorithm.backjoon;

/**
 * 좋은 구간
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01059 {
    static int[] S;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        S = new int[l];
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < l; i++) {
            S[i] = Integer.parseInt(st.nextToken());
            max = Math.max(S[i], max);
        }
        n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 1; i < max - 1; i++) {
            for (int j = i + 1; j < max; j++) {
                if ((n >= i && n <= j) && check(i, j)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }

    static boolean check(int min, int max) {
        return Arrays.stream(S).noneMatch(i -> i >= min && i <= max);
    }
}
