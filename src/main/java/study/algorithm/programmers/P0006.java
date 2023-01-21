package study.algorithm.programmers;

/**
 * 푸드 파이트 대회
 */

import java.util.ArrayList;
import java.util.Vector;

public class P0006 {
    public static String solution(int[] food) {
        String answer = "0";
        for (int i = food.length -1 ; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }
        return answer;
    }
}
