package study.algorithm.backjoon;

/**
 * 안테나
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B18310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        int[] houses = new int[length];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            houses[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(houses);

        bw.write(houses[(length-1)/2]+"");
        bw.close();


    }
}
