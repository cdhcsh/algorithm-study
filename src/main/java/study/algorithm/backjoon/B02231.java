package study.algorithm.backjoon;

/**
 * 분해합
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B02231 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //logic
        int min = n;
        for(int i = n ; i > 0 ; i--){
            int m = i;
            int sum = m;
            while(m > 0){
                sum += m%10;
                m/=10;
            }
            if(sum == n){
                min = Math.min(min, i);
            }

        }
        if(min==n) min = 0;
        //output
        System.out.println(min);

    }
}
