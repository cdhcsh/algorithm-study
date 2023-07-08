package study.algorithm.backjoon;

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
            M = L * (L - 1) / 2;
            if (M > N) break;
            if ((N - M) % L == 0) {
                answer = (N - M) / L;
                break;
            }
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
