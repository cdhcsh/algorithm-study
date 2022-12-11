package study.algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;

public class P0005 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = 1 ; i <= score.length/m ; i++)
            answer += score[score.length-m*i]*m;
        return answer;
    }
}
