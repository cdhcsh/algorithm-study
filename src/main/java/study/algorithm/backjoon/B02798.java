package study.algorithm.backjoon;

/**
 * 블랙잭
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B02798 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int cap = Integer.parseInt(st.nextToken());
        int[] cards = new int[count];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        //logic
        int max = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i+1; j < count - 1; j++) {
                for (int k = j+1; k < count; k++) {
                     int t = cards[i] + cards[j] + cards[k];
                     if(t <= cap && t > max){
                         max = t;
                     }
                }
            }
        }
        //output
        System.out.println(max);

    }
}
