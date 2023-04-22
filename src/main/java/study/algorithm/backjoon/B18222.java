package study.algorithm.backjoon;

/**
 * 투에 - 모스 문자열
 */

import java.io.*;

public class B18222 {
    static long[] pow;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long k = Long.parseLong(br.readLine());
        pow = new long[63];
        pow[0] = 1;
        for (int i = 1; i < 63; i++) {
            pow[i] = pow[i-1]*2;
        }
        System.out.println(find(k));
    }
    static int find(long n){
        if(n == 1){
            return 0;
        }
        for (int i = 0; i < 63; i++) {
            if(pow[i] >= n) return 1 - find(n - pow[i-1]);
        }
        return 0;
    }
}