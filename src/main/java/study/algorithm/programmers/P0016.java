package study.algorithm.programmers;

/**
 * 없는 숫자 더하기
 */

import java.util.Arrays;

public class P0016 {
    public static int solution(int[] numbers) {
        int answer = 45 - Arrays.stream(numbers).sum();
        return answer;
    }
}
