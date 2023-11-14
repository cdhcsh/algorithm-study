package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B14501 {
    static int N;
    static int[] T;
    static int[] P;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        T = new int[N+1];
        P = new int[N+1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i+1] = Integer.parseInt(st.nextToken());
            P[i+1] = Integer.parseInt(st.nextToken());
        }



    }
}
