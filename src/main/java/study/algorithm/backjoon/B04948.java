package study.algorithm.backjoon;

/**
 * 베르트랑 공준
 */

import java.io.*;

public class B04948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n<=0) break;
            int answer = 0;
            int[] arr = new int[n*2+1];
            for (int i = 2; i <= n ; i++) {
                for (int j = 2*i; j < arr.length; j+=i) {
                    arr[j]++;
                }
            }
            for (int i = n+1; i <= 2*n; i++) {
                if(i>1 && arr[i]==0) {
                    answer++;
                }
            }
            bw.write(answer+"\n");
        }
        bw.close();
    }
}
