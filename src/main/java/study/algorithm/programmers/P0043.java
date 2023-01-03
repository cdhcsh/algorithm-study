package study.algorithm.programmers;

public class P0043 {
    public static void start(){
        P0043 obj = new P0043();
        int storey = 45;
        System.out.println(obj.solution(storey));
    }
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0){
            int c = storey%10;
            storey/=10;
            if(c > 5)  {
                    storey++;
                c = 10 - c;
            }
            answer += c;
        }
        return answer;
    }
}
