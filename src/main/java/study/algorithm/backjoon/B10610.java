package study.algorithm.backjoon;

/**
 * 30
 */

import java.io.*;
import java.util.Arrays;

public class B10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += c - '0';
        }
        Arrays.sort(arr);
        if (arr[0] != '0' || sum % 3 != 0) {
            System.out.println("-1");
            return;
        }
        System.out.println(new StringBuilder(new String(arr)).reverse());


    }
}
