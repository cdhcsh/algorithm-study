package study.algorithm.backjoon;

/**
 * 리모컨
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01107 {
    static boolean[] buttons;
    static final int firstChannel = 100;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int object = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        buttons = new boolean[10];
        if (n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                buttons[Integer.parseInt(st.nextToken())] = true;
            }
        }
        int cnt = Math.abs(object-firstChannel);
        for (int i = 0; i <= 999999; i++) {
            int l = check(i);

            if (l > 0) {
                cnt = Math.min(Math.abs(object - i) + l, cnt);
            }
            if (cnt == 0) break;
        }
        System.out.println(cnt);


    }

    static int check(int n) {
        int c = 0;
        do {
            int m = n % 10;
            if (buttons[m]) return -1;
            n /= 10;
            c++;
        }while(n > 0);
        return Math.max(1,c);
    }
}
