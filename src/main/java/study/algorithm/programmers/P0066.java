package study.algorithm.programmers;

import java.util.*;

public class P0066 {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[][] tuples = Arrays.stream(s.replace("{", "").split("}"))// 투플 분리
                .filter(str -> str.length() > 0)//투플내 공백 제거
                .map(str -> Arrays.stream(str.split(","))//투플 배열화
                        .filter(str2 -> str2.length() > 0)//공백 제거
                        .mapToInt(Integer::parseInt)//int 배열로 변환
                        .toArray())
                .sorted((o1, o2) -> Integer.compare(o1.length,o2.length))
                .toArray(int[][]::new);
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[tuples.length];
        int n = 0;
        for (int[] tuple : tuples) {
            for (int t : tuple) {
                if (set.add(t)) answer[n++] = t;
            }
        }
        return answer;

    }

}
