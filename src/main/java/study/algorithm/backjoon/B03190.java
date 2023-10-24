package study.algorithm.backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B03190 {
    static int N;
    static HashMap<Integer,Integer> apples = new HashMap<>();
    static HashMap<Integer, String> orders = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            apples.put(x,y);
        }
        int o = Integer.parseInt(br.readLine());
        for (int i = 0; i < o; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(br.readLine());
            String c = st.nextToken();
            orders.put(s, c);
        }


    }
//    static int solve(){
//        int second = 0;
//        Snake front = new Snake(0,0);
//        Snake rear = front;
//
//    }
//    static b
//    static boolean check(){
//
//    }

    static class Snake {
        Snake front;
        Snake rear;
        int x;
        int y;

        public Snake(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Snake move(int toX,int toY){
            Snake tmp = new Snake(toX, toY);
            tmp.rear = this;
            this.front = tmp;
            return tmp;
        }
    }
}
