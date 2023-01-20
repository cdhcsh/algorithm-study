package study.algorithm.programmers;

import java.util.HashMap;

public class P0076 {
    public long solution(int[] weights) {
        long answer = 0;
        HashMap<Integer, Long> map = new HashMap<>();
        for (int weight : weights) {
            map.put(weight,map.getOrDefault(weight,0l)+1);
        }
        int[] arr = map.keySet().stream().mapToInt(i->i).toArray();
        for (int i = 0; i < arr.length; i++) {
            answer += (map.get(arr[i])-1)*map.get(arr[i])/2; //자기 자신끼리의 짝 고려
            for(int j = i+1 ; j < arr.length ; j++){
                if(check(arr[i],arr[j]))
                    answer += map.get(arr[i]) * map.get(arr[j]);
            }
        }
        return answer;

    }
    public boolean check(int weight1,int weight2){
        if(weight1 == weight2) return true;
        else if (weight1*2 == weight2*3) return true;
        else if (weight1*2 == weight2*4) return true;
        else if (weight1*3 == weight2*4) return true;
        else if (weight2*2 == weight1*3) return true;
        else if (weight2*2 == weight1*4) return true;
        else if (weight2*3 == weight1*4) return true;
        else return false;
    }
}
