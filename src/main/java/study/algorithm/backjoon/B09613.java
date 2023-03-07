package study.algorithm.backjoon;

/**
 * GCD 합
 */

import java.io.*;
import java.util.StringTokenizer;

public class B09613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int[] arr = new int[l];
            for (int j = 0; j < l; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            long answer = 0l;
            for (int j = 0; j < l-1; j++) {
                for (int k = j+1; k < l; k++) {
                    answer += gcd(arr[j],arr[k]);
                }
            }
            bw.write(answer+"\n");
        }
        bw.close();
        br.close();
    }
    static int gcd(int a, int b){
        while(b > 0){
            int r = b;
            b = a%b;
            a = r;
        }
        return a;
    }
}
