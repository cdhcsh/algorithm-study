package study.algorithm.programmers;

/**
 * 숫자의 표현
 */
public class P0065 {
    public int solution(int n) {
        int cnt = 0;
        int i = 1;
        while(n>0){
            if(n%i==0)cnt++;
            n-=i++;
        }
        return cnt;
    }
}
