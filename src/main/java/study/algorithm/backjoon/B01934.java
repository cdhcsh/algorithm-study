package study.algorithm.backjoon;

/**
 * 최소공배수
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int q = Math.max(n,m);
            int w = Math.min(n,m);
            int gcd = w;
            while (q%w!=0){
                gcd=q%w;
                q=w;
                w=gcd;
            }
            bw.write(n*m/gcd+"\n");
        }
        bw.close();


    }
}
