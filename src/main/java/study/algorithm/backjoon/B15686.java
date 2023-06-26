package study.algorithm.backjoon;

/**
 * 치킨 배달
 */

import java.io.*;
import java.util.StringTokenizer;

public class B15686 {
    static int[][] map;
    static int[][] chicken;
    static int chickens = 0;
    static int[][] house;
    static int houses = 0;
    static boolean[] visit;
    static int N;
    static int M;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        chicken = new int[N * N][2];
        house = new int[N*N][2];
        visit = new boolean[N * N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    chicken[chickens][0] = i;
                    chicken[chickens++][1] = j;
                } else if (map[i][j] == 1) {
                    house[houses][0] = i;
                    house[houses++][1] = j;
                }
            }
        }
        dfs(0);
        System.out.println(answer);


    }

    public static void dfs(int n) {
        if (n > 0) answer = Math.min(answer, getDistance());
        if (n == M) return;
        for (int i = 0; i < chickens; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(n++);
                visit[i] = false;
            }
        }
    }

    public static int getDistance() {
        int result = 0;
        for (int i = 0; i < houses; i++) {
            result += getDistance(i);
        }
        return result;
    }

    public static int getDistance(int index) {
        int x = house[index][0];
        int y = house[index][1];
        int min = N * N;
        for (int i = 0; i < chickens; i++) {
            if (visit[i]) {
                min = Math.min(min, Math.abs(chicken[i][0] - x) + Math.abs(chicken[i][1] - y));
            }
        }
        return min;
    }
}
