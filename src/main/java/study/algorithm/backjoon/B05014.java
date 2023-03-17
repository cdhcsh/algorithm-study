package study.algorithm.backjoon;

/**
 * 스타트링크
 */

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B05014 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> visit = new HashMap<>();
        LinkedList<Integer> queue = new LinkedList<>();
        visit.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            int c = queue.remove();
            int u = c + up;
            int d = c - down;
            if (u <= max && !visit.containsKey(u)) {
                visit.put(u, visit.get(c) + 1);
                queue.add(u);
            }
            if (d >= 1 && !visit.containsKey(d)) {
                visit.put(d, visit.get(c) + 1);
                queue.add(d);
            }
        }
        if(visit.containsKey(end)) System.out.println(visit.get(end));
        else System.out.println("use the stairs");

    }
}
