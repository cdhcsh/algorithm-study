package study.algorithm.programmers;

/**
 * 나머지가 1이 되는 수 찾기
 */

public class P0014 {
    public static int solution(int n) {
        for(int i = 1 ; i < n ; i ++)
            if(n%i ==1) return i;
        return n-1;
    }
}
