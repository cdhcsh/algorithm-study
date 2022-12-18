package study.algorithm.programmers;

public class P0014 {
    public static int solution(int n) {
        for(int i = 1 ; i < n ; i ++)
            if(n%i ==1) return i;
        return n-1;
    }
}
