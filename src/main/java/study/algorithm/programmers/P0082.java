package study.algorithm.programmers;

/**
 * 정수 내림차순으로 배치하기
 */

import java.util.Arrays;

public class P0082 {
    public static void main(String[] args) {
        System.out.println(new P0082().solution(118372));
    }
    public long solution(long n) {
        int[] nums = new int[10];
        int i = 0;
        long answer = 0;
        while (n > 0) {
            nums[i++] = (int)(n%10);
            n/=10;
        }
        Arrays.sort(nums);
        for (int j = 0; j < i;  j++) {
            answer *= 10;
            answer += nums[10-j-1];

        }
        return answer;
    }
}
