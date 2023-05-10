package study.algorithm.backjoon;

/**
 * 회전하는 큐
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01021 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Node front = new Node(1);
        Node rear = front;
        for (int i = 2; i <= N; i++) {
            rear = rear.connect(new Node(i));
        }
        rear.connect(front);

        st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int i = 0; i < M; i++) {
            int object = Integer.parseInt(st.nextToken());
            int c = 0;
            while (front.value != object) {
                c++;
                front = front.next;
            }
            answer += Math.min(c, (N--) - c);
            front = front.remove();
        }
        System.out.println(answer);


    }
    static class Node{
        Node pre;
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
        public Node connect(Node node){
            this.next = node;
            node.pre = this;
            return node;
        }
        public Node remove(){
            return pre.connect(next);
        }
    }
}
