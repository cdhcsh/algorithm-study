package study.algorithm.programmers;

/**
 * 둘만의 암호
 */

public class P0086 {
    public static void main(String[] args) {
        System.out.println(new P0086().solution("aukks","wbqd",5));
    }
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        StringBuilder list = new StringBuilder();
        for(int i = 0 ; i < 26 ; i++){
            char c = (char) ('a' + i);
            if(skip.indexOf(c)<0) list.append(c);
        }
        for (int i = 0; i < s.length(); i++) {
            answer.append(list.charAt((list.indexOf(s.charAt(i)+"")+index)%list.length()));
        }
        return answer.toString();
    }
}
