package study.algorithm.programmers;

/**
 * 편귱구하기
 */

public class P0060 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer+=i;
        }
        return answer/arr.length;
    }
}
