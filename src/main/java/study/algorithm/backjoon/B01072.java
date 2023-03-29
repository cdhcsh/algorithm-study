package study.algorithm.backjoon;

/**
 * 게임
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01072 {
    static long x;
    static long y;
    static long z;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Long.parseLong(st.nextToken());
        y = Long.parseLong(st.nextToken());
        z = y *100 / x;
        if(z >= 99) System.out.println("-1");
        else System.out.println(binarySearch(1,x));
    }
    static long binarySearch(long s,long e){
        long m = 0 ;
        long r = 0;
        while(s <= e){
            m = (s+e)/2;
            r = (y + m) * 100 / (x+m);
            if( r > z){
                e = m - 1;
            }
            else {
                s = m +1;
            }
        }
        return s;
    }
}
