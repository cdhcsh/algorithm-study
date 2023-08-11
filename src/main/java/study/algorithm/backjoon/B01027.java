package study.algorithm.backjoon;

/**
 * 고층 건물
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01027 {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        boolean[][] seen = new boolean[N][N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                seen[i][j] = seen[j][i] = check(i, j);
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (seen[i][j]) cnt++;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

    public static boolean check(int i, int j) {
        double d = getDegree(i, j);
        for (int k = i + 1; k < j; k++) {
            int l = arr[k];
            if (d <= getDegree(i, k)) return false;
        }
        return true;
    }

    public static double getDegree(int i, int j) {
        int n = arr[i];
        int m = arr[j];
        return 1.0 * (n - m) / (i - j);
    }
}
