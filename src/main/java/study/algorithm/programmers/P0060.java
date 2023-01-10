package study.algorithm.programmers;

public class P0060 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer+=i;
        }
        return answer/arr.length;
    }
}
