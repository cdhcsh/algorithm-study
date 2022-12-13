package study.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class P0011 {
    public static String solution(String X, String Y) {
        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();

        for(char c : X.toCharArray()){
            xMap.put(c,xMap.getOrDefault(c,0) + 1);
        }
        for (char c : Y.toCharArray()) {
            yMap.put(c,yMap.getOrDefault(c,0) + 1);
        }
        StringBuffer sb = new StringBuffer("");
        for(char c = '9' ; c >= '0' ; c--){
            int min=1;
            if(xMap.getOrDefault(c,0) < yMap.getOrDefault(c,0))
                min = xMap.getOrDefault(c,0);
            else
                min = yMap.getOrDefault(c,0);

            for(int i = 0 ; i < min ; i++){
                sb.append(c);
            }
        }
        if(sb.length()<=0) sb.append("-1");
        else if(sb.charAt(0)=='0') sb.delete(0,sb.length()-1);
        String answer = sb.toString();
        return answer;
    }
}
