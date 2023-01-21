package study.algorithm.programmers;

/**
 * 크기가 작은 부분 문자열
 */

public class P0028 {
    public static int solution(String t, String p) {
        int answer = 0;
        for(int i = 0 ; i < t.length() - p.length() + 1 ; i++){
            if(p.compareTo(t.substring(i,i+p.length()))>= 0){
                answer++;
            }
        }
        return answer;
    }
}
