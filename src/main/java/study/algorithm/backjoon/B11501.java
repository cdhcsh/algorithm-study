package study.algorithm.backjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class B11501 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        Card base = new Card(1);
        base.count+=1;
        Card one = new Card(1);
        Card two = new Card(2);
        base = one.h(base);
        base.print();
    }
    static class Card {
        int t;

        public Card(int t) {
            this.t = t;
        }

        int count = 0;

        public Card h(Card card){
            int temp = card.j(t);
            if(t==1) temp+=card.t;
            this.count = temp;
            return this;
        }

        public int j(int t){
            return (this.count+1) * t * this.t;
        }

        public void print(){
            int s = 1 + count;
            int d = 1 + (count-1)/3;
            System.out.println("==================================");
            System.out.println("Stat : +" + s + "/+" + s + ", spell damage (" + d + ")");
            System.out.println("count : " + count);
            System.out.println("==================================");
        }
    }
}
