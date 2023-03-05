package study.algorithm.backjoon;

/**
 * 마라톤 1
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int d[] = new int[n-1];
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            d[i] = distance(arr[i],arr[i+1]);
            sum+=d[i];
        }

        int max = 0;
        for (int i = 1; i < n-1; i++) { // i -> 1 ~ (n-1)
            int skip = distance(arr[i-1],arr[i+1]); // i-1 -> i+1 의 거리
            int normal = d[i-1]+d[i]; //i-1 -> i -> i+1 의 거리
            max = Math.max(max,normal-skip);
        }

        bw.write(sum-max+"");
        bw.close();
        br.close();
    }
    static int distance(int[] v1, int[] v2) {
        return Math.abs(v1[0]-v2[0])+Math.abs(v1[1]-v2[1]);
    }
}
