package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 덩치
 */

public class B07568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        int[][] arr= new int[length][2];
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = 1;
            for (int j = 0; j < length; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])answer[i]++;
            }
        }
        for (int i : answer) {
            bw.write(i+" ");
        }
        bw.close();
    }

}
