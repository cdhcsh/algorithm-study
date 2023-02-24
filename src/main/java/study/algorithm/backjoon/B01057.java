package study.algorithm.backjoon;

/**
 * 토너먼트
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken())-1;
        int m = Integer.parseInt(st.nextToken())-1;

        int t = 2;
        int c = 1;
        while (l > t ) {
            if(n/t==m/t){
                break;
            }
            t*=2;
            c++;
        }
        bw.write(c+"");
        bw.close();
    }
}
