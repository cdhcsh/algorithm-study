package study.algorithm.backjoon;

/**
 * 한줄로 서기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01138 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int p = 0;
            int c = Integer.parseInt(st.nextToken());
            while(c >= 0){
                if(arr[p] == 0){
                    c--;
                }
                if(c >= 0){
                    p++;
                }
            }
            arr[p] = i+1;
        }
        for (int i : arr) {
            bw.write(i+" ");
        }
        bw.close();
    }
}
