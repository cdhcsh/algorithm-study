package study.algorithm.programmers;

import java.math.BigInteger;

/**
 * 2*n 타일링
 */

public class P0039 {
    public static void main(String[] args) {
        System.out.println(new P0039().solution(100));
    }
    public String solution(int n) {
        BigInteger[] arr = new BigInteger[n];
        arr[0] = new BigInteger("1");
        arr[1] = new BigInteger("2");

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }

        return arr[n-1].toString();
    }
}