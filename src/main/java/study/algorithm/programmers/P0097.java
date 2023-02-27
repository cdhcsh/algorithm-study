package study.algorithm.programmers;

/**
 * 미로 탈출
 */

import java.util.*;

public class P0097 {
    public static void main(String[] args) {
        P0097 obj = new P0097();
        String[] maps = {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"};
        System.out.println(obj.solution(maps));
    }
    char[][] map;
    int[][] visit;
    int d[][] = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public int solution(String[] maps) {
        map = new char[maps.length][maps[0].length()];

        int answer = 0;
        Point start = null;
        Point lever = null;
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                map[i][j] = maps[i].charAt(j);
                if (map[i][j] == 'S') start = new Point(i, j);
                else if (map[i][j] == 'L') lever = new Point(i, j);
            }
        }
        int result = bfs(start, 'L');
        if (result < 0) return -1;
        answer += result;

        result = bfs(lever, 'E');
        if (result < 0) return -1;
        answer += result;

        return answer;
    }

    public int bfs(Point s, char destination) {
        int answer = -1;
        LinkedList<Point> queue = new LinkedList<>();
        queue.add(s);
        visit = new int[map.length][map[0].length];
        visit[s.x][s.y] = 1;
        while (!queue.isEmpty()) {
            Point p = queue.remove();
            for (int[] arr : d) {
                Point m = p.move(arr[0], arr[1]);
                if (m.check(visit.length, visit[0].length)
                        && map[m.x][m.y] != 'X'
                        && visit[m.x][m.y] == 0) {
                    visit[m.x][m.y] = m.cnt;
                    queue.add(m);
                    if (map[m.x][m.y] == destination) answer = m.cnt - 1;
                }
            }
        }
        return answer;

    }

    class Point {
        int x;
        int y;
        int cnt;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.cnt = 1;
        }

        public Point(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        public Point move(int dx, int dy) {
            return new Point(x + dx, y + dy, cnt + 1);
        }

        public boolean check(int xm, int ym) {
            return x >= 0 && x < xm && y >= 0 && y < ym;
        }
    }
}
