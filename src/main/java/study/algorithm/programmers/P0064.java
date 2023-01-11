package study.algorithm.programmers;

import java.util.Arrays;

public class P0064 {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return sqrt == (long) sqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
