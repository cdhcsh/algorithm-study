package study.algorithm.backjoon;

import java.io.*;

/**
 * 수 정렬하기
 */

public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10001];
        int l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.close();
    }
}
