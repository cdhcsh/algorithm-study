package study.algorithm.backjoon;

/**
 * 박스
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B01493 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            map.put(weight, count);
        }
        int divide = n - 1;
        long filled = 0;
        long answer = 0;
        for (; divide >= 0; divide--) {
            filled *= 8;
            long totalCubeCount = getCubeCount(divide, length, width, height) - filled;
            long cube = map.getOrDefault(divide, 0);
            long cnt = Math.min(cube, totalCubeCount);
            filled += cnt;
            answer += cnt;
        }
        if (getCubeCount(0,length,width,height) != filled) answer = -1;
        System.out.println(answer);
    }

    static long getCubeCount(int u, int l, int w, int h) {
        return ((long) (l >> u) * (w >> u) * (h >> u));
    }
}
