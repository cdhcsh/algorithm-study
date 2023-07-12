package study.algorithm.backjoon;

/**
 * 학생 번호
 */

import java.io.*;
import java.util.HashSet;
public class B01235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        int len = arr[0].length();
        int k = 1;
        for (; k <= len; k++) {
            for (int i = 0; i < N; i++) {
                set.add(arr[i].substring(len - k));
            }
            if(set.size()==N){
                break;
            }
            set.clear();
        }
        System.out.println(k);
    }
}
