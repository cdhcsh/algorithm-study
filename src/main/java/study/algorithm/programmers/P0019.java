package study.algorithm.programmers;

/**
 * 약수의 갯수와 덧셈
 */

public class P0019 {
    public static int solution(int left, int right) {
        int answer = 0;
        int d;
        for(int i = left ; i <= right ; i++){
            d = 0;
            for(int j = 1 ; j <= Math.sqrt(i); j++){
                if(i%j==0){
                    if(i/j==j) d++;
                    else d+=2;
                }
            }
            if(d%2==0) answer += i;
            else answer -= i;
        }
        return  answer;
    }
}
