package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 이항 계수 1
 */

public class B11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        bw.write(factorial(n) /(factorial(k) * factorial(n-k))+"");
        bw.close();

    }
    static long factorial(int n ){
        long result = 1;
        while(n > 1){
            result *= n--;
        }
        return  result;
    }

}
