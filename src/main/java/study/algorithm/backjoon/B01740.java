package study.algorithm.backjoon;

/**
 * 거듭제곱
 */

import java.io.*;

public class B01740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long answer = 0;
        long c = 1;
        while (n > 0) {
            if ((n & 1) == 1)
                answer += c;
            n = n >> 1;
            c *= 3;
        }
        System.out.println(answer);

    }
}
