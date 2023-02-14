package study.algorithm.softeer;

/**
 * [21년 재직자 대회 예선] 전광판
 */

import java.io.*;
import java.util.StringTokenizer;

public class S0002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] switches = {Integer.parseInt("1110111", 2),// 0
                Integer.parseInt("0100100", 2),// 1
                Integer.parseInt("1011101", 2),// 2
                Integer.parseInt("1101101", 2),// 3
                Integer.parseInt("0101110", 2),// 4
                Integer.parseInt("1101011", 2),// 5
                Integer.parseInt("1111011", 2),// 6
                Integer.parseInt("0100111", 2),// 7
                Integer.parseInt("1111111", 2),// 8
                Integer.parseInt("1101111", 2)// 9
        };
        int zero = 0;
        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = 0;
            while (a>0 || b> 0){
                int from = a > 0 ? switches[a%10] : zero;
                int to = b > 0 ? switches[b%10] : zero;
                answer+=Integer.bitCount(from^to);
                a/=10;
                b/=10;
            }
            bw.write(answer+"\n");
        }
        bw.close();

    }
}
