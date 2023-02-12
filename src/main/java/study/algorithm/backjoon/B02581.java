package study.algorithm.backjoon;

/**
 * 소수
 */

import java.io.*;

public class B02581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int from = Integer.parseInt(br.readLine());
        int to = Integer.parseInt(br.readLine());

        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = from; i <= to; i++) {
            if(isPrime(i)){
                answer +=i;
                min = Math.min(min,i);
            }
        }
        if (min == Integer.MAX_VALUE){
            bw.write("-1");
        }
        else{
            bw.write(answer+"\n");
            bw.write(min+"");
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
