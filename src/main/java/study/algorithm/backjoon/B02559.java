package study.algorithm.backjoon;

/**
 * 수열
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02559 {
    public static void main(String args[]) throws IOException{
       slideWindow();
    }
    static void slideWindow() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum+=arr[i];
            if(i >= (m)){
                sum-=arr[i-m];
                max = Math.max(sum, max);
            }
        }
        bw.write(max+"");
        bw.close();
    }
    static void prefixSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        arr[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1]+ Integer.parseInt(st.nextToken());
        }

        for(int i = m ; i <= n ; i++){
            max = Math.max(max,arr[i]-arr[i-m]);
        }
        bw.write(max+"");
        bw.close();
    }
}
