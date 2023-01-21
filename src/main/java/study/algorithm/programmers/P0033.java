package study.algorithm.programmers;

/**
 * 완주하지 못한 선수
 */

import java.util.HashMap;
import java.util.Map;

public class P0033 {
    public static void start() {
        P0033 obj = new P0033();
        String result = obj.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[]{"josipa", "filipa", "marina", "nikola"});
        System.out.println(result);
    }
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }
        return map.keySet().stream().filter(s -> map.get(s) > 0).findAny().get();
    }

}
