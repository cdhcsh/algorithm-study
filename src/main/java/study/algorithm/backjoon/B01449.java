package study.algorithm.backjoon;

/**
 * 수리공 항승
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken()) * 2;

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) * 2;
        }
        Arrays.sort(arr);

        int answer = 0;

        int pre = -2000;
        //pre : 이전에 붙인 테이프의 시작 위치
        for (int i = 0; i < n; i++) {
            int v = arr[i];
            if (pre + l < v + 1) {
                pre = v - 1;
                answer++;
            }
        }


        System.out.println(answer);
    }
}
