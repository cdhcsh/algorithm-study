package study.algorithm.backjoon;

/**
 * 카드 2
 */

import java.io.*;
import java.util.LinkedList;

public class B02164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        int i = 1;
        while (n >= i) {
            queue.add(i++);
        }
        while (queue.size() > 1) {
            queue.remove();
            queue.add(queue.remove());
        }
        bw.write(queue.peek() + "");
        bw.close();


    }
}
