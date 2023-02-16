package study.algorithm.backjoon;

/**
 * 어린 왕자
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(br.readLine());
            int answer = 0;
            for (int j = 0; j < cnt; j++) {
                st = new StringTokenizer(br.readLine());
                Circle c = new Circle(Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));
                if (c.isInclude(x1, y1) ^ c.isInclude(x2, y2)) {
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.close();


    }

    static class Circle {
        int x;
        int y;
        int r;

        public Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        boolean isInclude(int x, int y) {
            return r * r > getDistance(x, y);
        }

        int getDistance(int x, int y) {
            return (int) (Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        }
    }
}
