package study.algorithm.backjoon;

/**
 * 햄버거 분배
 */

import java.io.*;
import java.util.StringTokenizer;

public class B19941 {
    static int n;
    static int k;
    static char[] chars;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        chars = br.readLine().toCharArray();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if(chars[i]=='P')
                answer+=find(i);
        }
        System.out.println(answer);


    }

    static int find(int p) {
        int start = Math.max(0, p - k);
        int end = Math.min(n - 1, p + k);
        for (int i = start; i <= end; i++) {
            if (chars[i] == 'H') {
                chars[i] = 'X';
                return 1;
            }
        }
        return 0;
    }
}
