package study.algorithm.programmers;
import java.util.*;
public class P0003 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rank = new ArrayList<>();
        for(int i = 0 ; i < score.length; i++){
            if(rank.size() < k) rank.add(score[i]);
            else if(rank.get(0) < score[i])rank.set(0,score[i]);
            rank.sort(Comparator.naturalOrder());
            answer[i] = rank.get(0);
        }
        return answer;
    }
}
