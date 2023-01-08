package study.algorithm.programmers;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.LongStream;

public class P0025 {
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int i = 0;
        int[] answer = new int[set.size()];
        for (Integer integer : set) {
            answer[i++] = integer;
        }
        return answer;
    }

}
