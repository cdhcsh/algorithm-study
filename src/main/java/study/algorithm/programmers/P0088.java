package study.algorithm.programmers;

/**
 * 호텔 대실
 */

public class P0088 {
    public int solution(String[][] book_time) {
        final int MAX_MINUTE = 24*60+10;
        int[] hotel = new int[MAX_MINUTE];
        int answer = -1;
        for (int i = 0; i < book_time.length; i++) {
            int start = getMinutes(book_time[i][0]);
            int end = getMinutes(book_time[i][1])+10;
            hotel[start] += 1;
            hotel[end] -= 1;
        }
        for (int i = 1; i < MAX_MINUTE; i++) {
            hotel[i] += hotel[i-1];
            answer = Math.max(answer, hotel[i]);
        }
        return answer;
    }
    public int getMinutes(String s){
        int hour = Integer.parseInt(s.split(":")[0]);
        int minute = Integer.parseInt(s.split(":")[1]);
        return hour * 60 + minute;
    }
}
