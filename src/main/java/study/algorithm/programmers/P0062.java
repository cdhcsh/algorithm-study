package study.algorithm.programmers;

/**
 * 최대공약수와 최소공배수
 */

public class P0062 {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        int minDigit = 1;
        for(int i = min ; i > 0 ; i--){
            if(max%i==0 && min%i == 0) {
                minDigit = i;
                break;
            }
        }
        //최소 공배수는 최대공약수*a*b
        return new int[]{minDigit,n*m/minDigit};
    }
}
