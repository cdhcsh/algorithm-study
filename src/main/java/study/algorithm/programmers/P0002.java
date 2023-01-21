package study.algorithm.programmers;

/**
 * 문자열 나누기
 */

public class P0002 {
    public static int solution(String s){
        char[] chars = s.toCharArray();
        char x = ' ';
        int xCnt = 0,oCnt=0,answer = 0;
        boolean isSplit = true;
        for(int i = 0 ; i < chars.length ; i++){
            if(isSplit) {
                x = chars[i];
                isSplit = false;
            }
            if(x == chars[i])xCnt++;
            else oCnt++;

            if(xCnt == oCnt){
                answer++;
                isSplit = true;
            }
            else if(i == chars.length - 1) answer++;
        }
        return answer;
    }
}
