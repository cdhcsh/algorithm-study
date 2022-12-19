package study.algorithm.programmers;

import java.util.Arrays;

public class P0020 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        long zc = (int) Arrays.stream(lottos).filter(i->i==0).count();
        long win = Math.max(Arrays.stream(lottos).filter(i -> Arrays.stream(win_nums).anyMatch(j->i==j)).count(),1);
        answer[0] = (int) Math.max(7 - win - zc,1);
        answer[1] = (int) (7 - win);
        return answer;
    }
}
