package study.algorithm.backjoon;

/**
 * 다면체
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = 2 - v + e;
            bw.write(c+"\n");
        }
        bw.close();
        br.close();
    }
}
