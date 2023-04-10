package study.algorithm.backjoon;

/**
 * 등수 매기기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B02012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer += Math.abs((i + 1) - arr[i]);
        }
        System.out.println(answer);


    }
}
