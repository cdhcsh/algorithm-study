package study.algorithm.backjoon;

/**
 * Z
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01074 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.println(dfs(n, x, y));
    }

    static int dfs(int n, int x, int y) {
        if (n == 1) return x * 2 + y;
        int d = (int) Math.pow(2, --n);
        int p = x / d * 2 + y / d;
        return (p * (d * d)) + dfs(n, x % d, y % d);
    }

}
