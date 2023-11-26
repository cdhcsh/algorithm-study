package study.algorithm.backjoon;

/**
 * 수 이어 쓰기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B01515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int L = chars.length;
        int t = 1;
        for(int i = 0; i < L ;t++){
            String str = String.valueOf(t);
            int start = 0;
            while(i < L && (start = str.indexOf(chars[i],start)) >= 0){
                start++;
                i++;
            }
        }
        System.out.println(t-1);
    }

}