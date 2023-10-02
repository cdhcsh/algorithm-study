package study.algorithm.backjoon;

/**
 * 수 복원하기
 */

import java.io.*;
public class B02312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n; j++) {
                int cnt = 0;
                while (n%j == 0){
                    n /= j;
                    cnt++;
                }
                if (cnt > 0)
                    bw.write(j + " " + cnt + "\n");
                if (n == 0)
                    break;
            }
        }
        bw.close();


    }
}
