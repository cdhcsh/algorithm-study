package study.algorithm.programmers;

/**
 * 땅따먹기
 */

class P0042 {
    public int solution(int[][] land){
        for(int i = 1 ; i < land.length ; i++){
            land[i][0] = land[i][0] + max(land[i-1][1],land[i-1][2],land[i-1][3]);
            land[i][1] = land[i][1] + max(land[i-1][0],land[i-1][2],land[i-1][3]);
            land[i][2] = land[i][2] + max(land[i-1][0],land[i-1][1],land[i-1][3]);
            land[i][3] = land[i][3] + max(land[i-1][0],land[i-1][1],land[i-1][2]);
        }
        return max(land[land.length-1][0],land[land.length-1][1],land[land.length-1][2],land[land.length-1][3]);
    }
    public int max(int ... nums){
        int max = 0;
        for (int i : nums) max = Math.max(max, i);
        return max;
    }
}