package study.algorithm.programmers;

/**
 * 숫자 블럭
 */

public class P0075 {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int) (end-begin+1)];
        for(int i = 0  ; i <= end-begin;i++){
            answer[i] = (int) get(i+begin);
        }
        return answer;
    }
    public long get(long n){
        if(n == 0)return 0;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0){
                long m = (int)(n/i);
                if(m > 10000000) continue;
                else return m;
            }
        }
        return 1;
    }
}
