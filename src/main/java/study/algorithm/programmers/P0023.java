package study.algorithm.programmers;

public class P0023 {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0 ; i < a.length ; i++)
            answer+= a[i]*b[i];
        return answer;
    }
}
