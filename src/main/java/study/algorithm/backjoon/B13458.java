package study.algorithm.backjoon;

/**
 * 시험 감독
 */

import java.io.*;
import java.util.StringTokenizer;

public class B13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int classes[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            classes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        long answer = 0L;

        for (int i = 0; i < n; i++) {
            int t = classes[i];
            t -= f;
            answer++;
            if(t > 0) {
                answer += t / s;
                if (t % s > 0) answer++;
            }
        }
        System.out.println(answer);
    }
}
