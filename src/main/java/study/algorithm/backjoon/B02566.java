package study.algorithm.backjoon;

/**
 * 최댓값
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int HEIGHT = 9;
        final int WIDTH = 9;
        int maxValue = -1;
        int maxLocation = 0;
        for (int i = 0; i < HEIGHT*WIDTH; i++) {
            if(!st.hasMoreTokens())st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n > maxValue){
                maxValue = n;
                maxLocation = i;
            }
        }
        bw.write(maxValue + "\n");
        bw.write((maxLocation/WIDTH+1) + " " + (maxLocation%WIDTH+1));
        bw.close();
    }
}
