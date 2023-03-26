package study.algorithm.backjoon;

/**
 * 알바생 강호
 */

import java.io.*;
import java.util.Arrays;

public class B01758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long answer = 0;
        int i = 0;
        while(i < n && arr[n-i-1] > i){
            answer +=(arr[n-i-1]-i++);
        }

        bw.write(answer+"");
        bw.close();
    }
}
