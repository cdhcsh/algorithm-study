package study.algorithm.backjoon;

/**
 * 요세푸스 문제
 */

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B01158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        int c = k;
        bw.write("<");
        while (queue.size() > 1) {
            int p = queue.remove();
            if (--c == 0) {
                bw.write(p + ", ");
                c = k;
            } else queue.add(p);
        }
        bw.write(queue.remove() + ">");
        bw.close();
    }
}
