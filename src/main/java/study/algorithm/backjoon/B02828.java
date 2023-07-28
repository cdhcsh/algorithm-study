package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B02828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(br.readLine());

        int l = 1;
        int r = m;
        int answer = 0;
        for(int i = 0; i < cnt; i++) {
            int p = Integer.parseInt(br.readLine());

            if(l <= p && p <= r) {
                continue;
            }
            if(l > p) {
                answer += (l - p);
                r -= (l - p);
                l = p;
            }
            else{
                answer += (p - r);
                l += (p - r);
                r = p;
            }
        }

        System.out.println(answer);
    }
}
