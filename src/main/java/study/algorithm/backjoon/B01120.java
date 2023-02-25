package study.algorithm.backjoon;

/**
 * 문자열
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= b.length()-a.length(); i++) {
            min = Math.min(compare(a, b.substring(i, i + a.length())),min);
        }
        bw.write(min+"");
        bw.close();

    }
    static int compare(String a, String b){
        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) cnt++;
        }
        return cnt;
    }

}
