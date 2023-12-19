package study.algorithm.backjoon;

/**
 * 타노스
 */

import java.io.*;

public class B20310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] chars = str.toCharArray();
        int[] count = new int[2];

        for (int i = 0; i < chars.length; i++) {
            count[chars[i]-'0']++;
        }
        int c = 0;
        for (int i = 0; c < count[1]/2; i++) {
            if(chars[i]=='1') {
                chars[i]=' ';
                c++;
            }
        }
        c = 0;
        for (int i = chars.length-1; c < count[0]/2; i--) {
            if(chars[i]=='0'){
                chars[i] = ' ';
                c++;
            }
        }
        System.out.println(new String(chars).replace(" ",""));
    }
}
