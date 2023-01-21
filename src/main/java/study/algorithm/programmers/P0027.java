package study.algorithm.programmers;

/**
 *
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P0027 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Queue<Integer>[] board_q = new Queue[board[0].length];

        Stack<Integer> pocket = new Stack<>();
        for(int i = 0 ; i < board_q.length ; i++){
            board_q[i] = new LinkedList<>();
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[j][i]+" ");
                if(board[j][i]>0)board_q[i].add(board[j][i]);
            }
            System.out.println();
        }
        for (int i : moves) {
            if(board_q[i-1].isEmpty()) continue;
            int n = board_q[i-1].remove();
            if(!pocket.isEmpty() && pocket.peek()==n){
                pocket.pop();
                answer+=2;
            }
            else
                pocket.push(n);
        }
        return answer;
    }
}
