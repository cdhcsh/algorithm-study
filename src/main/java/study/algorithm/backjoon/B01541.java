package study.algorithm.backjoon;

/**
 * 잃어버린 괄호
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01541 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), "+-", true);
        int answer = 0;
        boolean minus = false;
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.matches("^[+-]$")) {
                if (s.equals("-")) {
                    minus = true;
                }
            } else {
                answer += (minus ? -1 : 1) * Integer.parseInt(s);
            }
        }
        System.out.println(answer);

    }
}
