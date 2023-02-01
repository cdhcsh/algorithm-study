package study.algorithm.programmers;

/*
자연수 뒤집어 배열로 만들기
 */

public class P0083 {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[answer.length-i-1] = str.charAt(i)-'0';
        }
        return answer;
    }
}
