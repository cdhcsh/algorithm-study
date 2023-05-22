package study.algorithm;

import study.algorithm.backjoon.B01021;

import java.io.*;
import java.util.StringTokenizer;

public class B28078 {
    static Node front = new Node(-1);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int mode = 0;
            if(command.equals("push")){

            }else if(command.equals("rotate")){

            } else if (command.equals("count")) {

            } else if (command.equals("pop")) {

            }
        }


    }
    static class Node{
        Node pre = null;
        Node next = null;
        int value;
        public boolean hasNextWall(){
            if(value==1) return true;
            else if(this.next!=null) return this.next.hasNextWall();
            else return false;
        }
        public boolean hasPreWall(){
            if(value==1) return true;
            else if(this.pre!=null) return this.pre.hasPreWall();
            else return false;
        }
        public Node(int value){
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
