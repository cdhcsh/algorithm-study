package study.algorithm.programmers;

/**
 * 숫자 문자열과 영단어
 */

public class P0018 {
    public static int solution(String s) {
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0 ; i < words.length ; i++){
            s = s.replaceAll(words[i],i+"");
        }
        return Integer.parseInt(s);
    }
}
