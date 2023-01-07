package study.algorithm.programmers;

import java.util.HashMap;

public class P0049 {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer> cnts = new HashMap<>();
        for (int i : tangerine) {
            cnts.put(i,cnts.getOrDefault(i,0)+1);
        }
        tangerine = cnts.keySet().stream().sorted((i,j)-> cnts.get(j).compareTo(cnts.get(i))).mapToInt(i->i=i).toArray();
        int answer = 0;
        for (int i : tangerine) {
            answer++;
            k-=cnts.get(i);
            if(k<=0) return answer;
        }
        return answer;
    }
}
