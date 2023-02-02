package study.algorithm.programmers;

/**
 * 개인정보 수집 유효기간
 */

import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class P0085 {
    final int DAYOFMONTH = 28;
    public int[] solution(String today, String[] terms, String[] privacies) {
        Day day = new Day(today);
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] pair = terms[i].split(" ");
            map.put(pair[0], Integer.valueOf(pair[1]));
        }
        return IntStream.rangeClosed(1,privacies.length)
                .filter(i->{
                    String[] privacy = privacies[i-1].split(" ");
                    return day.getDistanceMonth(privacy[0]) > map.get(privacy[1])*DAYOFMONTH;
                })
                .toArray();


    }
    class Day {
        int year;
        int month;
        int day;

        public Day(String str){
            StringTokenizer st = new StringTokenizer(str,".");
            year = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            day = Integer.parseInt(st.nextToken());
        }
        int getDistanceMonth(String str){
            return getDistanceMonth(new Day(str));
        }
        int getDistanceMonth(Day day){
            return Math.abs(getDays()-day.getDays());
        }
        int getDays(){
            return year*12*DAYOFMONTH+month*DAYOFMONTH+day;
        }
    }
}
