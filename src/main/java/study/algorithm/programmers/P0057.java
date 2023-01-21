package study.algorithm.programmers;

/**
 * k진수에서 소수 갯수 구하기
 */

public class P0057 {
    public int solution(int n, int k) {
        // n <= 1000000, 3<=k<=10
        String str = Integer.toString(n,k);
        System.out.println(str);
        String[] arr = str.split("0");
        int cnt = 0;
        for(String s : arr){
            if(isPrime(Long.parseLong(s))) cnt++;
        }
        return cnt;
    }
    public boolean isPrime(long number){
        if(number <= 1) return false;
        for(long i = 2; i <= Math.sqrt(number) ; i++){
            if(number%i == 0) return false;
        }
        return true;
    }
}
