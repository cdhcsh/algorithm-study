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
            int p = i+1;
            int c = Integer.parseInt(st.nextToken())+1;
            int k = 0;
            do{
                while(arr[k]==0)k++;
                c--;
            }while(c > 0);
            arr[k] = p;
        }
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
