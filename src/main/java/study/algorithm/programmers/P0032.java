package study.algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0032 {
    public static void start() {
        P0032 obj = new P0032();
        int[] result = obj.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 0; i < commands.length; i++) {
            int n = commands[i][0];
            int m = commands[i][1];
            int k = commands[i][2];
            List<Integer> sub = new ArrayList<>(list.subList(n - 1, m));
            sub.sort(Integer::compareTo);
            answer[i] = sub.get(k - 1);
        }

        return answer;
    }
}
