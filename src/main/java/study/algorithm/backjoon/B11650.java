package study.algorithm.backjoon;

/**
 * 좌표 정렬하기
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Point[] arr = new Point[l];
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y);
        }
        Arrays.sort(arr);
        for (Point p : arr) {
            bw.write(p.x + " " + p.y + "\n");
        }
        bw.close();
    }

    static class Point implements Comparable {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Object o) {
            if (o.getClass().equals(this.getClass())) {
                Point p = (Point) o;
                if (this.x == p.x)
                    return this.y - p.y;
                else return this.x - p.x;

            } else return 0;
        }
    }
}

