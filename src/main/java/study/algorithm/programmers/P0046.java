package study.algorithm.programmers;

import static java.lang.Math.max;


public class P0046 {
    public static void start(){
        P0046 obj = new P0046();
        int n = 3;
        long left = 2;
        long right = 5;
        int[] result = obj.solution(n,left,right);
        System.out.println(result);
    }
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        for(int i = 0 ; i < right - left + 1 ; i++){
            int x = (int) ((left+i) / n);
            int y = (int) ((left+i) % n);
            answer[i] = max(x,y)+1;
        }
        return answer;
    }
}
