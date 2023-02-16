package study.algorithm.backjoon;

/**
 * 직각삼각형
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B04153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true){
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] == 0) break;
            Arrays.sort(arr);
            if(arr[0]*arr[0]+arr[1]*arr[1]== arr[2]*arr[2])
                bw.write("right\n");
            else
                bw.write("wrong\n");
        }
        bw.close();

    }
}
