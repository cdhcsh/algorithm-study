package study.algorithm.programmers;

import java.util.ArrayList;

public class P0055 {
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String word = words[0];
        list.add(word);
        for(int i = 1 ; i < words.length ; i++){
            String target = words[i];
            char last = word.charAt(word.length()-1);
            char first = target.charAt(0);
            if(last!=first){
                return new int[]{(i%n)+1,(i/n)+1};
            }
            else{
                if(list.contains(target)){
                    return new int[]{(i%n)+1,(i/n)+1};
                }
                else {
                    list.add(target);
                    word = target;
                }
            }
        }
        return new int[]{0,0};
    }
}
