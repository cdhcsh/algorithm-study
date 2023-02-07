package study.algorithm.programmers;

/**
 * 테이블 해시 함수
 */

import java.util.Arrays;

class P0090 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        data = Arrays.stream(data)
                .sorted((i, j) -> {
                    if (i[col - 1] == j[col - 1])
                        return Integer.compare(j[0], i[0]);
                    else
                        return Integer.compare(i[col - 1], j[col - 1]);
                })
                .toArray(int[][]::new);
        int answer = 0;
        for (int i = row_begin; i <= row_end; i++) {
            int sum = 0;
            for (int j = 0; j < data[i-1].length; j++) {
                sum += data[i-1][j]%(i);
            }
            answer = answer^sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new P0090().solution(new int[][]{{2,2,6},{1,5,10},{4,2,9},{3,8,3}},2,2,3));
    }
}