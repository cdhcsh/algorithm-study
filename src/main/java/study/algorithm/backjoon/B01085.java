package study.algorithm.backjoon;

/**
 * 직사각형에서 탈출
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        bw.write(min(x,y,w-x,h-y)+"\n");
        bw.close();
    }
    static int min(int ... nums){
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min,num);
        }
        return min;
    }
}
