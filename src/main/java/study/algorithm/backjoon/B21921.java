package study.algorithm.backjoon;

/**
 * 블로그
 */

import java.io.*;
import java.util.StringTokenizer;

public class B21921 {
    static int N;
    static int X;
    static int[] guests;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        guests = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            guests[i] = Integer.parseInt(st.nextToken());
        }
        int p = 0;
        for (int i = 0; i < X; i++) {
            p += guests[i];
        }
        int max = p;
        int cnt = 1;

        for (int i = 1; i <= N-X; i++) {
            p = p - guests[i-1] + guests[i+X-1];
            if(p > max){
                max = p;
                cnt = 1;
            }
            else if(p == max) cnt++;
        }
        if(max == 0) System.out.println("SAD");
        else System.out.println(max+"\n"+cnt);
    }
}
