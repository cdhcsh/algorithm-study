package study.algorithm.backjoon;

/**
 * 막대기
 */

import java.io.*;

public class B01093 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.bitCount(Integer.parseInt(br.readLine())));
    }
}
