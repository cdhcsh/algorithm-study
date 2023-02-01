package study.algorithm.backjoon;

/**
 * ZOAC 4
 */

import java.io.*;
import java.util.StringTokenizer;

public class B23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        bw.write(((h-1)/(n+1)+1) * ((w-1)/(m+1) + 1)+"");
        bw.flush();
        bw.close();
    }
}
