package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B08979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][3];
        int[] obj = new int[3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            if(t == k) obj = arr[i];
        }
        int result = 1;
        for (int i = 0; i < n; i++) {
            if(compare(obj,arr[i]) < 0) result++;
        }
        System.out.println(result);

    }

    public static int compare(int[] a, int[] b) {
        if (a[0] == b[0]) {
            if (a[1] == b[1]){
                return a[2] - b[2];
            }
            else return a[1] - b[1];
        }
        return a[0] - b[0];
    }
}
