package study.algorithm.backjoon;

/**
 * 차량 번호판 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B16969 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //logic
        long answer = 1;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            int i = c == 'd' ? 10 : 26;
            i = c == prev ? i-1 : i;
            prev = c;
            answer = (answer * i)%1000000009;
        }
        //output
        System.out.println(answer);
    }
}
