package study.algorithm.backjoon;

/**
 * 기타줄
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int six = 1001;
        int one = 1001;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            six = Math.min(Integer.parseInt(st.nextToken()), six);
            one = Math.min(Integer.parseInt(st.nextToken()), one);
        }
        int answer;
        if (one * 6 < six) answer = n * one; /*6개 단위보다 낱개로 사는게 저렴할때 */
        else answer = Math.min((n / 6 + 1) * six,/*6개 단위로만 산거*/
                                n / 6 * six + n % 6 * one);/*딱 맞추어 산거*/
        bw.write(answer + "");
        bw.close();


    }

}
