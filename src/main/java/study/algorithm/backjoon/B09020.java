package study.algorithm.backjoon;

/**
 * 골드바흐의 추측
 */

import java.io.*;

public class B09020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            for (int j = 2; j <= n ; j++) {
                for (int k = 2*j; k < arr.length; k+=j) {
                    arr[k]++;
                }
            }
            for (int j = n/2; j <=n; j++) {
                if(arr[j] == 0 && arr[n-j]==0){
                    bw.write((n-j) + " " + j + "\n");
                    break;
                }
            }
        }
        bw.close();
    }
}
