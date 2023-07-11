package study.algorithm.backjoon;

/**
 * 수열의 합
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int M;
        int answer = -1;
        while (true) {
            M = N - (L * (L - 1) / 2);
            if (M < 0 || L > 100) break;
            if (M % L == 0) {
                answer = M / L;
                break;
            }
            L++;
        }
        if (answer == -1) System.out.println(-1);
        else {
            for (int i = 0; i < L; i++) {
                bw.write((i + answer) + " ");
            }
            bw.close();
        }
    }
}
