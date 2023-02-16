package study.algorithm.backjoon;

/**
 * 택시 기하학
 */

import java.io.*;

public class B03053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int r = Integer.parseInt(br.readLine());


        bw.write(String.format("%.6f\n",r*r*Math.PI));
        bw.write(String.format("%.6f\n",r*r*2.0));
        bw.close();
    }
}
