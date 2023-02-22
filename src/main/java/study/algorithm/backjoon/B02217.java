package study.algorithm.backjoon;

/**
 * 로프
 */

import java.io.*;
import java.util.Arrays;

public class B02217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int[] ropes = new int[length];
        for (int i = 0; i < ropes.length; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        int max = 0;
        int c= 1;
        for (int i = length - 1; i >= 0; i--) {
            max = Math.max(ropes[i]*c++,max);
        }

        bw.write(max+"");
        bw.close();


    }
}
