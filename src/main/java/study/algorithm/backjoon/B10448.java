package study.algorithm.backjoon;

/**
 * 유레카 이론
 */

import java.io.*;
import java.util.stream.IntStream;

public class B10448 {
    static int[] t;
    static int MAX = 44;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = new int[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            t[i] = i * (i + 1) / 2;
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            bw.write(solution(Integer.parseInt(br.readLine())) + "\n");
        }
        bw.close();


    }

    static int solution(int n) {
        return IntStream.rangeClosed(1, MAX).anyMatch(
                (i) -> IntStream.rangeClosed(1, MAX).anyMatch(
                        (j) -> IntStream.rangeClosed(1, MAX).anyMatch(
                                (k) -> t[i] + t[j] + t[k] == n
                        )
                )
        ) ? 1 : 0;
    }
}
