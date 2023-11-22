package study.algorithm.backjoon;

/**
 * 어두운 굴다리
 */

import java.io.*;
import java.util.StringTokenizer;

public class B17266 {
    static int[] column;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(binarySearch());

    }
    public static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        column = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            column[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static int binarySearch(){
        int l = 1;
        int r = N;
        while(l<=r){
            int m = (l+r)/2;
            if(check(m))
                r = m-1;
            else
                l = m+1;
        }
        return l;
    }

    public static boolean check(int k) {
        int p = 0;
        for (int i = 0; i < M; i++) {
            if (column[i] - k <= p) p = column[i] + k;
            else return false;
        }
        return N - p <= 0;
    }
}
