package study.algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P0031 {
    public static void start() {
        P0031 obj = new P0031();
        int[] result = obj.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int[] answers) {
        int[][] users = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        Map<Integer, Integer> currents = new HashMap<>();
        for(int i = 0 ; i < answers.length ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(users[j][i%users[j].length]==answers[i])currents.put(j+1,currents.getOrDefault(j+1,0)+1);
            }
        }

        int[] result = currents.keySet().stream().sorted(
                (o1, o2) -> currents.getOrDefault(o2,0).compareTo(currents.getOrDefault(o1,0))
        ).mapToInt(i->i).toArray();
        return Arrays.stream(result).filter(i->
                currents.getOrDefault(i,0).equals(currents.getOrDefault(result[0],0))
        ).toArray();
    }
}
