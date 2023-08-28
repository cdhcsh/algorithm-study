package study.algorithm.backjoon;

/**
 * 카드 1
 */

import java.io.*;
import java.util.LinkedList;

public class B02161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        while(queue.size() > 1){
            bw.write(queue.poll()+" ");
            queue.add(queue.poll());
        }
        bw.write(queue.poll()+"");
        bw.close();
        br.close();


    }
}
