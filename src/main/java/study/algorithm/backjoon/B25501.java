package study.algorithm.backjoon;

/**
 * 재귀의 귀재
 */

import java.io.*;

public class B25501 {
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            int result = isPalindrome(br.readLine());
            bw.write(result + " " + cnt + "\n");
        }
        bw.close();


    }

    public static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        cnt = 0;
        return recursion(s, 0, s.length() - 1);
    }
}
