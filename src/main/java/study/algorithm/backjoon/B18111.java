package study.algorithm.backjoon;

/**
 * 마인크래프트
 */

import java.io.*;
import java.util.StringTokenizer;

public class B18111 {

    public static void main(String[] args) throws IOException {
        int MAX = 257;
        int[] map = new int[MAX];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int min = MAX;
        int max = 0;
        for (int i = 0; i < w; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < h; j++) {
                int g = Integer.parseInt(st.nextToken());
                map[g]++;
                min = Math.min(g, min);
                max = Math.max(g, max);
            }
        }
        int answer = Integer.MAX_VALUE;
        int height = 0;
        for (int i = min; i <= max; i++) {
            int time = 0;
            int inventory = b;
            for (int j = 0; j < MAX; j++) {
                time += (j > i ? -2 : 1) * (i - j) * map[j];
                inventory += (j - i) * map[j];
            }
            if (inventory < 0) continue;
            if (time <= answer) {
                answer = time;
                height = i;
            }
            bw.write(answer + " " + height);
            bw.close();
        }
    }

}
