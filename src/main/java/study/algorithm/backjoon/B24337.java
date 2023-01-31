package study.algorithm.backjoon;

/**
 * 가희와 탑
 */

import java.io.*;
import java.util.StringTokenizer;

public class B24337 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        //logic
        if(n < (a+b)-1) {
            System.out.println(-1);
            return;
        }
        int max = Math.max(a, b);
        int ta = a;
        int tb = b;
        int k = n - (a + b) + 1;
        StringBuilder top = new StringBuilder(max + "");
        StringBuilder middle = new StringBuilder("");
        StringBuilder bottom = new StringBuilder("");
        while (ta > 1) {
            top.insert(0, (ta-- - 1) + " ");
        }
        while (tb > 1) {
            bottom.append(" " + (tb-- - 1));
        }
        while (k > 0){
            k--;
            if(a>1) top.insert(0,"1 ");
            else bottom.insert(0," 1");
        }
        System.out.println(top.append(middle).append(bottom));
    }
}
