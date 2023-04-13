package study.algorithm.backjoon;

/**
 * 신입사원
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01946 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int grade = Integer.parseInt(st.nextToken());
                int review  = Integer.parseInt(st.nextToken());
                arr[grade-1] = review-1;
            }
            int answer = 0;
            int pre = n;
            for (int j = 0; j < n; j++) {
                if(arr[j] < pre){
                    answer++;
                    pre = arr[j];
                }
            }
            bw.write(answer+"\n");
        }
    bw.close();

    }
}
