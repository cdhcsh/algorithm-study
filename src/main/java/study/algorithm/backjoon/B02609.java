package study.algorithm.backjoon;

/**
 * 최대공약수와 최소공배수
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int i = Math.max(n,m);
        int j = Math.min(n,m);
        int gcd = j;
        while (i%j!=0){
            gcd = i%j;
            i = j;
            j = gcd;
        }
        int lcm = n*m/gcd;
        bw.write(gcd+"\n");
        bw.write(lcm+"");
        bw.close();

    }
}
