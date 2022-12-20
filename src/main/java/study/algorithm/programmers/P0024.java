package study.algorithm.programmers;

public class P0024 {
    public static int solution(int n) {
        return Integer.parseInt( new StringBuffer(Integer.toString(n,3)).reverse().toString(),3);
    }
}
