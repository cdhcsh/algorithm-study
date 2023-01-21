package study.algorithm.programmers;

/**
 * 최대값과 최솟값
 */

import java.util.Arrays;

public class P0069 {
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        return arr[0] + " " + arr[arr.length - 1];
    }
}