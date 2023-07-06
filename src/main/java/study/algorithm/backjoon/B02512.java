package study.algorithm.backjoon;

/**
 * 예산
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B02512 {
    static int[] arr;
    static long answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long M = Long.parseLong(br.readLine());
        long left = 0;
        long right = arr[N - 1];
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            for (int money : arr) {
                if (money >= mid) sum += mid;
                else sum += money;
            }
            if (sum > M) {
                right = mid - 1;
            } else {
                left = mid + 1;
                answer = Math.max(answer, mid);
            }
        }
        System.out.println(answer);
    }
}
