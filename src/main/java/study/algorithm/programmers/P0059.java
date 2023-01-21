package study.algorithm.programmers;

/**
 * 하샤드 수
 */

public class P0059 {
    public boolean solution(int x) {
        return x%getDigitSum(x)==0;
    }
    public int getDigitSum(int n){
        int sum = 0;
        while (n > 0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }
}
