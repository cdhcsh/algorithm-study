package study.algorithm.programmers;

/**
 * 짝수와 홀수
 */

public class P0063 {
    public String solution(int num) {
        return (num&1)==0 ? "Even" : "Odd";
    }
}
