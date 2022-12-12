package study.algorithm.programmers;

public class P0009 {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += n / a * b;
            n = n % a + n / a * b;
        }
        return answer;
    }
}
