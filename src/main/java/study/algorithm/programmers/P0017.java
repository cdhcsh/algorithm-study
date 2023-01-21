package study.algorithm.programmers;

/**
 * 부족한 금액 계산하기
 */

import java.util.stream.LongStream;

public class P0017 {
    public long solution(int price, int money, int count) {
        long answer = LongStream.rangeClosed(1, count).sum() * price - money;
        return answer > 0 ? answer : 0;
    }
}
