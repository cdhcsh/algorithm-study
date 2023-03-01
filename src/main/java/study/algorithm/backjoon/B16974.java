package study.algorithm.backjoon;

/**
 * 레벨 햄버거
 */

import java.io.*;
import java.util.StringTokenizer;

public class B16974 {
    static long[] c,p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        c = new long[n+1];
        p = new long[n+1];
        c[0] = 1;
        p[0] = 1;
        for (int i = 1; i <= n; i++) {
            c[i] = 1 + c[i-1] + 1 + c[i-1] +1;
            p[i] = p[i-1] + 1 + p[i-1];
        }
        bw.write(find(n,x)+"");
        bw.close();
    }
    static long find(int n,long x){
        if (n == 0) {
            if (x == 0) return 0;
            else if (x == 1) return 1;
        }

        if(x == 1)
            return 0;
        else if(x <= 1 + c[n - 1])
            return find(n - 1, x - 1);
        else if(x == 1 + c[n - 1] + 1)
            return p[n - 1] + 1;
        else if(x <= 1 + c[n - 1] + 1 + c[n - 1])
            return p[n - 1] + 1 + find(n - 1, x - (1 + c[n - 1] + 1));
        else
            return p[n - 1] + 1 + p[n - 1];
    }

}
