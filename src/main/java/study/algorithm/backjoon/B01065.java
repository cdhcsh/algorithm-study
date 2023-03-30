package study.algorithm.backjoon;

/**
 * 한수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B01065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (check(i)) answer++;
        }
        System.out.println(answer);
    }

    static boolean check(int num) {
        if (num < 100) return true;
        int t = num % 10;
        num /= 10;
        int p = num % 10;
        num /= 10;
        int d = t - p;
        while (num > 0) {
            t = p;
            p = num % 10;
            if (t - p != d) return false;
            num /= 10;
        }
        return true;
    }
}
