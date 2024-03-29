package study.algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class start {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] target = new int[20000001];
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(n<0) n = 10000000-n;
            target[n] = 1;
        }
        length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int n = Integer.parseInt(st.nextToken());
            bw.write(target[n < 0 ? 10000000-n : n]+" ");
        }
        bw.close();
    }
}