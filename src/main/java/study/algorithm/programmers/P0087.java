package study.algorithm.programmers;

/**
 * 이상한 문자 만들기
 */

public class P0087 {
    public static void main(String[] args) {
        System.out.println(new P0087().solution("my   name   is dong hwan"));
    }
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c;
            c = s.charAt(i);
            if(c != ' '){
                if (cnt%2==0 && c >= 'a' && c <= 'z') c-=32;
                else if(cnt%2!=1 && c >= 'A' && c <= 'Z')c+=32;
                cnt++;
            }
            else {
                cnt = 0;
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
