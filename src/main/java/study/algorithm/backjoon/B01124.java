package study.algorithm.backjoon;

/**
 * 언더프라임
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01124 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int max = B + 1;
        int answer = 0;
        int[] primes = new int[max];
        primes[0] = 1;
        primes[1] = 1;
        for (int i = 2; i < max; i++) {
            if (primes[i] == 0) { //primes[i] 소수면
                for (int j = 2 * i; j < max; j += i) {
                    int tmp = j;
                    while (tmp % i == 0) {
                        primes[j]++;
                        tmp /= i;
                    }
                }
            }
            if (i >= A && primes[primes[i]] == 0) { // i 가 A 이상이면서 소인수분해한 갯수가 소수이다.
                answer++;
            }
        }
        bw.write(answer + "");
        bw.close();
    }
}
