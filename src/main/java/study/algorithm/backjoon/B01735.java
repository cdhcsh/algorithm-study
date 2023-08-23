package study.algorithm.backjoon;

/**
 * 분수 합
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int c1, c2, p1, p2;

        st = new StringTokenizer(br.readLine());
        c1= Integer.parseInt(st.nextToken());
        p1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        c2= Integer.parseInt(st.nextToken());
        p2= Integer.parseInt(st.nextToken());

        c1=c1*p2+c2*p1;
        p1=p1*p2;
        int gcd= getGcd(c1, p1);

        System.out.println(c1/gcd+" "+p1/gcd);
    }

    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
