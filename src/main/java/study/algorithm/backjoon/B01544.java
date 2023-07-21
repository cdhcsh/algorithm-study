package study.algorithm.backjoon;

/**
 * 사이클 단어
 */

import java.io.*;
import java.util.ArrayList;

public class B01544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> arr[] = new ArrayList[N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
            String str = br.readLine();
            for(int j=0; j<str.length(); j++){
                arr[i].add(str.substring(j)+ str.substring(0,j));
            }

            boolean chk = true;
            for (int j = 0; chk && j <= i-1; j++) {
                for (int k = 0; chk && k < arr[j].size(); k++) {
                    if (str.equals(arr[j].get(k))) chk = false;
                }
            }
            if (chk)
                result++;
        }

        System.out.println(result);
    }
}
