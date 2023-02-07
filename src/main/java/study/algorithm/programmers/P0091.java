package study.algorithm.programmers;

/**
 * 점 찍기
 */

public class P0091 {
    public long solution(int k, int d) {
        long answer = 0;
        long dd = (long) Math.pow(d,2);
        for(long i = 0 ; i <= d ; i+=k){
            answer+= Math.floor(Math.sqrt(dd-(i * i)))/k+1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new P0091().solution(1,5));
    }

}
