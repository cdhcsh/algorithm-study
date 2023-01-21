package study.algorithm.programmers;

/**
 * 가장 큰 정사각형 찾기
 */

class P0040 {
    public int solution(int [][]board)
    {
        int max = board[0][0];
        for(int i = 1 ; i < board.length;i++){
            for(int j = 1 ; j < board[0].length  ; j++){
                if(board[i][j] > 0)   {
                    board[i][j] = Math.min(Math.min(board[i-1][j],board[i][j-1]),board[i-1][j-1]) + 1;
                    max = Math.max(board[i][j],max);
                }
            }
        }
        return max*max;
    }
}