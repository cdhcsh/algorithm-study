package study.algorithm.backjoon;

/**
 * 쉬운 최단거리
 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B14940 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[][] visit = new int[n][m];
        int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<Point> queue = new LinkedList<>();
        //logic
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) queue.add(new Point(i, j, 0));
            }
        }
        while (!queue.isEmpty()) {
            Point p1 = queue.remove();
            for (int i = 0; i < 4; i++) {
                Point p2 = p1.move(d[i]);
                if (p2.check(n, m) && visit[p2.x][p2.y] <= 0 && map[p2.x][p2.y] == 1) {
                    visit[p2.x][p2.y] = p2.cnt;
                    queue.add(p2);
                }
            }
        }
        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < visit[i].length; j++) {
                if (map[i][j] == 1 && visit[i][j] == 0) bw.write(-1 + " ");
                else bw.write(visit[i][j] + " ");
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
        //output
    }

    static class Point {
        int x;
        int y;
        int cnt;

        public Point(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        public Point move(int[] arr) {
            return new Point(x + arr[0], y + arr[1], cnt + 1);
        }

        public boolean check(int xm, int ym) {
            if (x < 0 || x >= xm) return false;
            else return y >= 0 && y < ym;
        }
    }
}
