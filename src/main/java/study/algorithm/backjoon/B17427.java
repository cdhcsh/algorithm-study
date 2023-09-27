package study.algorithm.backjoon;

/**
 * 약수의 합 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 0L;
        for (int i = 1; i <= N ; i++) {
            answer += (long) (N / i) * i;
        }
        System.out.println(answer);
    }
}
