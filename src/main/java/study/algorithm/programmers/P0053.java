package study.algorithm.programmers;

/**
 * 문자열 내 마음대로 정렬하기
 */

import java.util.Arrays;
import java.util.Comparator;

public class P0053 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings,(s1, s2) -> {
            int r = Character.compare(s1.charAt(n - 1), s2.charAt(n - 1));
            if (r == 0) return s1.compareTo(s2);
            else return r;
        });
        return strings;
    }
}
