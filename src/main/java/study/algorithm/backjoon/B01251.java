package study.algorithm.backjoon;

/**
 * 단어나누기
 */

import java.io.*;
import java.util.stream.IntStream;

public class B01251 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String min = str;
        for (int i = 2; i < str.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder s = new StringBuilder();
                s.append(new StringBuilder(str.substring(0, j)).reverse());
                s.append(new StringBuilder(str.substring(j, i)).reverse());
                s.append(new StringBuilder(str.substring(i)).reverse());
                min = (min.compareTo(s.toString()) > 0) ? s.toString() : min;
            }
        }
        System.out.println(min);


    }
}
