package study.algorithm.backjoon;

/**
 * A -> B
 */

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B16953 {
    static HashMap<Long, Integer> map;
    static LinkedList<Long> queue;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        map = new HashMap<>();
        queue = new LinkedList<>();
        map.put(a, 1);
        queue.add(a);
        while (!queue.isEmpty()) {
            long p = queue.pop();
            int c = map.get(p);
            if (p == b) break;
            long n1 = p * 10 + 1;
            long n2 = p * 2;
            if (n1 <= b) add(n1, c);
            if (n2 <= b) add(n2, c);
        }
        System.out.println(map.getOrDefault(b, -1));
    }

    static void add(long n, int c) {
        map.put(n, c + 1);
        queue.add(n);
    }
}
