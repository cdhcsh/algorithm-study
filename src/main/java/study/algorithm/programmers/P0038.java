package study.algorithm.programmers;

/**
 * 124나라의 숫자
 */

public class P0038 {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        StringBuffer sb = new StringBuffer();
        while(n > 0){
            int k = n % 3;
            n /= 3;
            if(k == 0) n--;
            sb.insert(0,numbers[k]);
        }

        return sb.toString();
    }
}
