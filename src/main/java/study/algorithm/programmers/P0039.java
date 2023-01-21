package study.algorithm.programmers;

/**
 * 2*n 타일링
 */

public class P0039 {
    public int solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < n; i++) {
            int num = arr[i - 1] + arr[i - 2];
            arr[i] = num % 1000000007;
        }

        return arr[n-1];
    }
}