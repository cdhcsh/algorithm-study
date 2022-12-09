package study.algorithm.programmers;

public class P0001 {
    static int[] solution(String s) {
        char[] chars = s.toCharArray();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[i] = -1;
            for (int j = i - 1; j > 0; j--)
                if (chars[i] == chars[j]) {
                    answer[i] = i - j;
                    break;
                }
        }


        return answer;
    }
    public static void main(String[] args) {
        int[] answer;
        answer = solution("aaabbbccc");
        for(int i : answer) System.out.print(i+" ");
    }
}
