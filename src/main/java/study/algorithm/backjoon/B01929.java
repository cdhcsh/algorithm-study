package study.algorithm.backjoon;

/**
 * 소수 구하기
 */

import java.io.*;

public class B01929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int from = Integer.parseInt(br.readLine());
        int to = Integer.parseInt(br.readLine());
        for (int i = from; i <= to; i++) {
            if(isPrime(i)){
                bw.write(i+"\n");
            }
        }
        bw.close();
        return;
    }
    static boolean isPrime(int n){
        if(n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
