package study.algorithm.programmers;

/**
 * 3진법 뒤집기
 */

public class P0024 {
    public static int solution(int n) {
        return Integer.parseInt( new StringBuffer(Integer.toString(n,3)).reverse().toString(),3);
    }
}
