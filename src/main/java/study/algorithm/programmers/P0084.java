package study.algorithm.programmers;

/*
자릿수 더하기
 */

public class P0084 {
    public int solution(int n){
        int answer = 0;
        while (n > 0){
            answer+=(n%10);
            n/=10;
        }
        return answer;
    }
}
