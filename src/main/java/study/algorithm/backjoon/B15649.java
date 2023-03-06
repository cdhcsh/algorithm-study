package study.algorithm.backjoon;

/**
 * N과 M(1)
 */

import java.io.*;
import java.util.StringTokenizer;

public class B15649 {
    static BufferedWriter bw = null;
    static int N;
    static int M;
    static boolean[] visit;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        answer = new int[M];
        dfs(0);
        bw.close();

    }

    static void dfs(int n) throws IOException {
        if (n == M) {
            print();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visit[i - 1]) {
                visit[i - 1] = true;
                answer[n] = i;
                dfs(n + 1);
                visit[i - 1] = false;
            }
        }

    }

    static void print() throws IOException {
        for (int i = 0; i < answer.length; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
    }

}
