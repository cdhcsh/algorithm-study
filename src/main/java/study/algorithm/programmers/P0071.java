package study.algorithm.programmers;

import java.util.PriorityQueue;
import java.util.Queue;

public class P0071 {
    public int solution(int[] arr) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i : arr)
            pq.add(i);
        int t = 1;
        while(!pq.isEmpty())
            t = getLCM(pq.remove(),t);
        return t;
    }
    int getLCM(int a,int b){

        int t = a * b;
        int m = 1;
        while(b>0){ //최대공약수
            m = a % b;
            a = b;
            b = m;
        }
        return t/a; //최소공배수
    }
}
