package study.algorithm.backjoon;

/**
 * 회의실 배정
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B01931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Meet[] arr = new Meet[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = new Meet(start, end);
        }
        Arrays.sort(arr);

        int pre = 0;
        int answer = 0;
        for (Meet m : arr) {
            if (m.start >= pre) {
                answer++;
                pre = m.end;
            }
        }
        System.out.println(answer);


    }

    static class Meet implements Comparable<Meet> {
        int start;
        int end;

        public Meet(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meet o) {
            if (this.end == o.end) return this.start - o.start;
            else return this.end - o.end;
        }
    }
}
