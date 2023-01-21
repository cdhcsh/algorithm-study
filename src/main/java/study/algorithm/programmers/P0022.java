package study.algorithm.programmers;

/**
 * 신규 아이디 추천
 */

public class P0022 {
    public static String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^\\w\\-_.]*","");
        answer = answer.replaceAll("\\.{2,}",".");
        answer = answer.replaceAll("^\\.","");
        answer = answer.isEmpty() ? "a" : answer;
        answer = answer.length()>15 ? answer.substring(0,15) : answer;
        answer = answer.replaceAll("\\.$","");
        while(answer.length() < 3) answer+= answer.charAt(answer.length()-1);
        return answer;
    }
}
