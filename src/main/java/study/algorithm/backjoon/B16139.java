package study.algorithm.backjoon;

/**
 * 인간 - 컴퓨터 상호작용
 */

import java.io.*;
import java.util.StringTokenizer;

public class B16139 {
    static int[][] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        char[] arr = str.toCharArray();
        d = new int[arr.length+1][26];
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i]-'a';
            d[i+1][j]++;
            for (int k = 0; k < 26; k++) {
                d[i + 1][k] += d[i][k];
            }
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char c = (char) (st.nextToken().charAt(0)-'a');
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            bw.write(d[end+1][c]-d[start][c]+"\n");
        }
        bw.close();
    }
}
