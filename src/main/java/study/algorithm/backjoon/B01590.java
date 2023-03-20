package study.algorithm.backjoon;

/**
 * 캠프가는 영식
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01590 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            while(s < t && --c > 0 && s < answer) s+=i;
            if(s >= t) answer = Math.min(s,answer);
        }
        if(answer==Integer.MAX_VALUE) System.out.println("-1");
        else System.out.println(answer-t);
    }
}
