package study.algorithm.backjoon;

/**
 *  ACM 호텔
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10250
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            bw.write(String.format("%d%02d\n",(n-1)%h+1,(n-1)/h+1));
        }
        bw.flush();
        bw.close();
    }
}
