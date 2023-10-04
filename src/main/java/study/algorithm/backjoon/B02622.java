package study.algorithm.backjoon;

/**
 * 삼각형만들기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B02622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= N/3 ; i++) {
            for (int j = i; j <= (N-i)/2; j++) {
                int k = N-i-j;
                if(j > k) break;
                if((i+j) > k) cnt++;
            }
        }
        System.out.println(cnt);


    }
}
