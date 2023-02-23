package study.algorithm.backjoon;

/**
 * 구간 합 구하기 4
 */


import java.io.*;
import java.util.StringTokenizer;

public class B11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i+1] = sum + Integer.parseInt(st.nextToken());
            sum = arr[i+1];
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int answer = arr[to] - arr[from-1];
            bw.write(answer+"\n");
        }
        bw.close();


    }
}
