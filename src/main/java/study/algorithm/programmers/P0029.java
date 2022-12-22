package study.algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P0029 {
    public static int[] solution(int N, int[] stages) {
        Map<Integer,Float> result = new HashMap<>();
        int members = stages.length;
        for(int i = 1 ; i <= N ; i++){
            if(members <= 0) result.put(i,0f);
            else {
                float count = 0;
                for (int j : stages)
                    if(j==i)count++;
                members -= count;
                result.put(i, count/members);
            }
        }
        return result.keySet().stream().sorted((i,j) -> {
            int c = result.get(j).compareTo(result.get(i));
            if(c == 0) return i.compareTo(j);
            else return c;
        }).mapToInt(i-> i).toArray();
    }
}
