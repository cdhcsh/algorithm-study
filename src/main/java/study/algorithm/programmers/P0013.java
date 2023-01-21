package study.algorithm.programmers;

/**
 * 신고 결과 받기
 */

import java.util.*;

public class P0013 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> users = new HashMap<>();
        Map<String, Integer> r_users = new HashMap<>();
        for (String s : id_list) {
            users.put(s, new ArrayList<>());
        }
        for (String s : report) {
            String[] split = s.split(" ");
            if (!users.get(split[0]).contains(split[1])) {
                users.get(split[0]).add(split[1]);
                r_users.put(split[1], r_users.getOrDefault(split[1], 0) + 1);
            }
        }
        return Arrays.stream(id_list).map(user ->
                        users.get(user).stream()
                                .filter(t -> r_users.getOrDefault(t, 0) >= k)
                                .count())
                .mapToInt(Long::intValue)
                .toArray();
    }
}
