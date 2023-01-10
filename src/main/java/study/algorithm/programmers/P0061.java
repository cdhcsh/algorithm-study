package study.algorithm.programmers;

public class P0061 {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n!=1){
            if((n&1)==1){ // 홀수
                n = n * 3 + 1;
            }
            else{
                n/=2;
            }
            System.out.println(n);
            answer++;
            if(answer > 500) return -1;
        }
        return answer;
    }
}
