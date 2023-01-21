package study.algorithm.programmers;

/**
 * 혼자놀기의 달인
 */

import java.util.Arrays;

public class P0052 {
    public static void start(){
        int[] cards = {8,6,3,7,2,5,1,4};
        P0052 obj = new P0052();
        System.out.println(obj.solution(cards));

    }
    int[] visit;
    public int solution(int[] cards) {
        int length = cards.length;
        visit = new int[length];
        int[] answer = new int[length];
        int n = 0;
        for(int i = 0 ; i < length ; i++){
            if(visit[i] == 0)
            answer[n++] = dfs(i,cards);
        }
        Arrays.sort(answer);
        return answer[length-1]*answer[length-2];
    }
    public int dfs(int i,int[] cards){
        visit[i] = 1;
        if(visit[cards[i]-1]==0)
            return 1 + dfs(cards[i]-1,cards);
        else
            return 1;
    }
}
