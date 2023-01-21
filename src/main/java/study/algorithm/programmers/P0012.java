package study.algorithm.programmers;

/**
 * 성격 유형 검사
 */

import java.util.HashMap;
import java.util.Map;

public class P0012 {
    public static String solution(String[] survey, int[] choices) {
        int[] scores = {3, 2, 1, 0, -1, -2, -3};
        char[][] types = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        Map<Character, Integer> result = new HashMap();
        char c;
        String answer = "";
        for (int i = 0; i < survey.length; i++) {
            c = survey[i].charAt(0);
            result.put(c, result.getOrDefault(c, 0) + scores[choices[i] - 1]);
        }
        for (int i = 0; i < 4; i++)
            answer += result.getOrDefault(types[i][1], 0) > result.getOrDefault(types[i][0], 0) ? types[i][1] : types[i][0];
        return answer;
    }
}
