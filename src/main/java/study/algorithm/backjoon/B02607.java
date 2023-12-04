package study.algorithm.backjoon;

/**
 * 비슷한 단어
 */

import java.io.*;

public class B02607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine())-1;
        int[] base = convert(br.readLine());
        int answer = 0;
        while (N > 0){
            String s = br.readLine();
            int[] target = convert(s);
            boolean d = false;
            boolean b = true;
            for (int i = 0; i < 26; i++) {
                if(base[i]==target[i])continue;
                int t = Math.abs(base[i]-target[i]);
                if(t > 1 || d){
                    b = false;
                    break;
                }
                d = true;
            }
            if(b) {
                System.out.println(s);
                answer++;
            }

            N--;
        }
        System.out.println(answer);
    }
    public static int[] convert(String s){
        int[] r = new int[26];
        for (int i = 0; i < s.length(); i++) {
            r[s.charAt(i)-'A']++;
        }
        return r;
    }
}
