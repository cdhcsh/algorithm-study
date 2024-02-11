package study.algorithm.backjoon;

/**
 * 스위치 켜고 끄기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[] switches = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < switches.length; i++) {
            switches[i] = st.nextToken().equals("1");
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken()) - 1;
            if (s == 1) { // 남학생이라면
                for (int j = d; j < n; j += (d+1)) {
                    switches[j] = !switches[j];
                }
            } else { // 여학생이라면
                int p = 0;
                while ((d - p) >= 0 && (p + d) < n) {
                    if (switches[d - p] != switches[d + p]) break;
                    switches[d - p] = switches[d + p] = !switches[d + p];
                    p++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(i % 20 == 0 && i > 0) sb.append("\n");
            sb.append((switches[i] ? 1 : 0) + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
