package study.algorithm.backjoon;

/**
 * 최소 힙
 */

import java.io.*;
import java.util.PriorityQueue;

public class B01927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0)
                if (queue.isEmpty()) bw.write("0\n");
                else bw.write(queue.remove() + "\n");
            else
                queue.offer(m);
        }
        bw.close();
    }
}
