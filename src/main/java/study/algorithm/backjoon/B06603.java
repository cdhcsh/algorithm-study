package study.algorithm.backjoon;

/**
 * 로또
 */

import java.io.*;
import java.util.StringTokenizer;

public class B06603 {
    static int[] set = new int[6];
    static boolean[] visit;
    static int N = 6;
    static int[] arr;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.countTokens() > 1) {
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            visit = new boolean[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0);
            sb.append("\n");
            st = new StringTokenizer(br.readLine());
        }
        bw.write(sb.toString());
        bw.close();

    }

    static void dfs(int n) {
        if (n == N) {
            for (int i = 0; i < 6; i++) {
                sb.append(set[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        int d = (n == 0) ? 0 : set[n-1];
        for (int i = 0; i < arr.length; i++) {
            if (!visit[i] && arr[i] > d) {
                visit[i] = true;
                set[n] = arr[i];
                dfs(n+1);
                visit[i] = false;
            }
        }
    }
}
