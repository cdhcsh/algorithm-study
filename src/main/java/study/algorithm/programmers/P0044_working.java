package study.algorithm.programmers;

/**
 * 다펜스 게임
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class P0044_working {
    public static void start() {
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
        P0044_working obj = new P0044_working();
        System.out.println(obj.solution(n, k, enemy));
    }

    public int solution(int n, int k, int[] enemy) {
        int left = 0;
        int right = enemy.length;
        while (left >= right) {
            int mid = (right + left) / 2;
            if (isAble(mid, n, k, enemy)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public boolean isAble(int t, int n, int k, int[] enemy) {
        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 0  ; i < t+1 ; i++) queue.add(enemy[i]);
        while (!queue.isEmpty()) {
            int e = queue.poll();
            if (n >= e) { // 아군의 병사의 수가 적보다 크거나 같으면
                n -= e; // 그만큼 아군 감소
                continue; // 다음 적 상대하기
            }
            //아군병사가 더 적을 경우
            queue.add(e); // 해치우지 못한 적 다시 복귀
            return k >= queue.size(); //방어권 사용횟수 확인
        }
        return true;
    }
}
