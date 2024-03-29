package study.algorithm.backjoon;

/**
 * 덱
 */

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push_back" :
                    deque.addLast(Integer.valueOf(st.nextToken()));
                    break;
                case "push_front" :
                    deque.addFirst(Integer.valueOf(st.nextToken()));
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.removeFirst()+"\n");
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.removeLast()+"\n");
                    break;
                case "size" :
                    bw.write(deque.size()+"\n");
                    break;
                case "empty" :
                    bw.write((deque.isEmpty() ? 1 : 0 )+"\n");
                    break;
                case "front" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.peekFirst()+"\n");
                    break;
                case "back" :
                    if(deque.isEmpty()) bw.write(-1+"\n");
                    else bw.write(deque.peekLast()+"\n");
                    break;
            }
        }
            bw.close();
    }
}
