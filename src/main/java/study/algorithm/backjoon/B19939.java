package study.algorithm.backjoon;

/**
 * 박 터뜨리기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B19939 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int max = (k+1)*k/2;
        if(max > n) {
            System.out.println("-1");
            return;
        }
        int answer = (n-max)%k==0 ? k-1 : k;
        System.out.println(answer);
    }
}
