package study.algorithm.programmers;

/**
 * 핸드폰 번호 가리기
 */

public class P0058 {
    public String solution(String phone_number) {
        char[] chars = phone_number.toCharArray();
        for (int i = 0; i < chars.length-4; i++) {
            chars[i] = '*';
        }
        return new String(chars);
    }
}
