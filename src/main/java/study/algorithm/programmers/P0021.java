package study.algorithm.programmers;

/**
 * 음양 더하기
 */

public class P0021 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0 ; i < absolutes.length ; i++)
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        return answer;
    }
}
