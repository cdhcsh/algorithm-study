package study.algorithm.programmers;

/**
 * 시저 암호
 */

public class P0095 {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length ; i++) {
            int t = chars[i];
            if(chars[i] >= 'a' & chars[i]<= 'z'){
                t = (t+n-'a')%('z'-'a'+1)+'a';
            }
            else if(chars[i] >= 'A' & chars[i]<= 'Z'){
                t = (t+n-'A')%('Z'-'A'+1)+'A';
            }
            chars[i] = (char)t;
        }
        return new String(chars);
    }
}
