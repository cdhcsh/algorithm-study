package study.algorithm.backjoon;

import java.io.*;
import java.util.HashSet;

public class B11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length()-i; j++) {
                set.add(s.substring(j,j+i+1));
            }
        }
        bw.write(set.size()+"");
        bw.close();


    }
}
