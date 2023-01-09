package study.algorithm.programmers;

import java.util.*;

public class P0056 {
    int maxTime = getMinute("23:59");
    public int[] solution(int[] fees, String[] records) {
        Map<String,Integer> in = new TreeMap<>();
        for (String record : records) {
            String[] info = record.split(" ");
            int m = getMinute(info[0]);
            String car = info[1];
            String oper = info[2];
            if(oper.equals("IN")){
                in.put(car,in.getOrDefault(car,0)-m);
            }
            else{
                in.put(car,in.get(car)+m); // 출차시간 만큼 더함
            }
        }
        return in.keySet().stream()
                .mapToInt(parkTime -> getFee(in.get(parkTime),fees))
                .toArray();
    }
    public int getMinute(String time){
        String[] str = time.split(":");
        return Integer.parseInt(str[0])*60 + Integer.parseInt(str[1]);
    }
    public int getFee(int parkTime,int[] fees){
        if(parkTime <= 0 ) parkTime += maxTime;
        double addTime = Math.max(parkTime- fees[0],0);
        return (int) (fees[1] + Math.ceil(addTime / fees[2]) *fees[3]);
    }
}
