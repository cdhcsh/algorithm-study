package study.algorithm.backjoon;

/**
 * 주유소
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B13305 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int[] cites = new int[length];
        int[] distances = new int[length-1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < length-1 ; i++){
            distances[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < length ; i++){
            cites[i] = Integer.parseInt(st.nextToken());
        }
        //logic
        long answer = 0;
        long price = 1000000001;
        for (int i = 0; i < length-1; i++) {
            price = Math.min(price,cites[i]);
            answer += price*distances[i];
        }
        //output
        System.out.println(answer);

    }
}
