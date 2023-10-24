package study.algorithm.backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B03190 {
    static int N;
    static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static boolean[][] apples;
    static HashMap<Integer, String> orders = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        apples = new boolean[N + 1][N + 1];
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            apples[x][y] = true;
        }
        int o = Integer.parseInt(br.readLine());
        for (int i = 0; i < o; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            String c = st.nextToken();
            orders.put(s, c);
        }
        System.out.println(solve());


    }

    static int solve() {
        int second = 0;
        int d = 0;
        Snake front = new Snake(1, 1);
        while (true) {
            second++;
            front = front.move(d);
            if (isWall(front) || isCrash(front)) break;
            if (!isApple(front)) {
                front.remove();
            }
            if (orders.containsKey(second)) {
                d = getRotatedDirection(d, orders.get(second));
            }
        }
        return second;
    }

    static int getRotatedDirection(int d, String s) {
        if (s.equals("L")) d--;
        else d++;
        return (d + 4) % 4;

    }

    static boolean isApple(Snake snake) {
        int x = snake.x;
        int y = snake.y;
        if (apples[x][y]) {
            apples[x][y] = false;
            return true;
        }
        return false;
    }

    static boolean isWall(Snake snake) {
        int x = snake.x;
        int y = snake.y;
        return x <= 0 || x > N || y <= 0 || y > N;
    }

    static boolean isCrash(Snake snake) {
        Snake tmp = snake.rear;
        while (tmp != null) {
            if (tmp.x == snake.x && tmp.y == snake.y) return true;
            tmp = tmp.rear;
        }
        return false;
    }

    static class Snake {
        Snake rear = null;
        int x;
        int y;

        public Snake(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Snake move(int d) {
            Snake tmp = new Snake(x + directions[d][0], y + directions[d][1]);
            tmp.rear = this;
            return tmp;
        }

        public void remove() {
            if (rear == null) return;
            if (rear.rear != null) rear.remove();
            else rear = null;
        }
    }
}
