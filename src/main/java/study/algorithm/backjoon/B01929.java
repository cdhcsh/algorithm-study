package study.algorithm.backjoon;

/**
 * 소수 구하기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        int[] arr = new int[to+1];

        for (int i = 2; i <= to/2 ; i++) {
            for (int j = 2*i; j < arr.length; j+=i) {
                arr[j]++;
            }
        }
        for (int i = from; i <= to; i++) {
            if(i>1 && arr[i] == 0) bw.write(i+"\n");
        }
        bw.close();
    }
}
