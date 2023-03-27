package study.algorithm.backjoon;

/**
 * 접두사
 */

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class B01141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr,(s1,s2)->Integer.compare(s2.length(), s1.length()));
        HashSet<String> set = new HashSet<>();
        for (String s1: arr) {
            if (set.size() == 0) {
                set.add(s1);
                continue;
            }
            boolean b = true;
            for (String s2 : set) {
                if (s2.indexOf(s1) == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                set.add(s1);
            }
        }

        bw.write(set.size()+"");
        bw.close();



    }
}
