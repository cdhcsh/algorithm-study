package study.algorithm.backjoon;

/**
 * 칸토어 집합
 */

import java.io.*;

public class B04779 {
    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            int len = (int) Math.pow(3, n);
            sb.append("-".repeat(Math.max(0, len)));
            solve(n, 1);
            System.out.println(sb);
        }

    }

    public static void solve(int n,int size) {
        if(size==1) {
            return;
        }
        int m=size/3;
        for(int i=n+m; i<n+2*m; i++) {
            sb.setCharAt(i, ' ');
        }

        solve(n, m);
        solve(n+2*m, m);
    }

}
