package study.algorithm.backjoon;

/**
 * 카드 합체 놀이
 */

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> queue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Long.valueOf(st.nextToken()));
        }
        for (int i = 0; i < m; i++) {
            long a = queue.poll();
            long b = queue.poll();
            queue.add(a+b);
            queue.add(a+b);
        }
        System.out.println(queue.stream().mapToLong(l->l).sum());


    }
}
