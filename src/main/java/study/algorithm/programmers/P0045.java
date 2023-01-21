package study.algorithm.programmers;

/**
 * JadenCase
 */

import java.util.StringTokenizer;

public class P0045 {
    public String solution(String s) {
        String answer = "";
        StringTokenizer stringTokenizer = new StringTokenizer(s, " ", true);
        while (stringTokenizer.hasMoreTokens()) {
            String str = stringTokenizer.nextToken().toLowerCase();
            if (str.equals(" "))
                answer += str;
            else {
                str = str.toLowerCase();
                if (str.charAt(0) < '9') {
                    answer += str;
                }
                else{
                    answer += str.substring(0,1).toUpperCase()+ str.substring(1);
                }
            }
        }
        return answer;
    }
    public String solution2(String s){
        char[] arr = s.toCharArray();
        boolean active = true;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i]==' '){
                active = true;
            }
            else{
                if(active){
                    arr[i] = Character.toUpperCase(arr[i]);
                    active = false;
                }
                else{
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        }
        return new String(arr);
    }

}
