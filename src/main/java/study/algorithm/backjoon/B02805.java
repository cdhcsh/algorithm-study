package study.algorithm.backjoon;

/**
 * 나무 자르기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B02805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int trees[] = new int[N];

        int left = 0, right = Integer.MIN_VALUE;
        st = new StringTokenizer(bw.readLine(), " ");
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            trees[i] = num;
            right = Math.max(right, num);
        }

        while(left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for(int i = 0; i < N; i++) {
                if(trees[i] > mid) sum += trees[i] - mid;
            }

            if(M <= sum) left = mid + 1;
            else right = mid - 1;
        }

        System.out.println(right);
        bw.close();

    }
}
