package study.algorithm.backjoon;

/**
 * 하키
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01358 {
    static int w, h, x, y, r;
    static int[] v1, v2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        r = h / 2;
        int k = Integer.parseInt(st.nextToken());

        v1 = new int[]{x, y + r};
        v2 = new int[]{x + w, y + r};

        int answer = 0;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());
            if (check(new int[]{px, py})) answer++;
        }
        bw.write(answer + "");
        bw.close();
    }

    static boolean check(int[] v) {
        int vx = v[0];
        int vy = v[1];
        if (vx >= x && vx <= x + w && vy >= y && vy <= y + h)
            return true;
        else return distance(v, v1) <= Math.pow(r, 2)
                || distance(v, v2) <= Math.pow(r, 2);
    }

    static double distance(int[] v1, int[] v2) {
        return Math.pow(v1[0] - v2[0], 2) + Math.pow(v1[1] - v2[1], 2);
    }
}
