package study.algorithm.programmers;

/**
 * 기사단원의 무기
 */

public class P0004 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int atk = 0;
            for (int j = 1; j <= Math.sqrt(i); j++)
                if (i % j == 0) {
                    if (i / j != j) atk += 2;
                    else atk++;
                }
            answer += atk > limit ? power : atk;
        }
        return answer;
    }
}
