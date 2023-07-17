package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B01500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long answer = 1;
        int d = S / K;
        int m = S % K;
        for (int i = 0; i < K; i++) {
            int p = d;
            if (m-- > 0) p++;
            answer *= p;
        }
        System.out.println(answer);
    }
}
