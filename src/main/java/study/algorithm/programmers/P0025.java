package study.algorithm.programmers;

import java.util.Set;
import java.util.TreeSet;

public class P0025 {
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().distinct().mapToInt(i -> i).toArray();
    }

}
