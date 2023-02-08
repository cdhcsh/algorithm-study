package study.algorithm.programmers;

/**
 * 우박수열 정적분
 */

import java.util.Arrays;
import java.util.stream.LongStream;

public class P0093 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P0093().solution(71, new int[][]{{0, 0}, {0, -1}, {2, -3}, {3, -3}})));
    }
    public double[] solution(int k,int[][] ranges) {
        double[] answer = new double[ranges.length];
        double[] areas;
        //우박수열 계산
        long[] longs = LongStream
                .iterate(k, i -> i > 0, i -> i == 1 ? -1 : (i % 2 == 0 ? i / 2 : (i * 3 + 1)))
                .toArray();
        //구간별 면적 계산
        areas = new double[longs.length-1];
        for(int i = 0 ; i < areas.length;i++){
            double min = Math.min(longs[i],longs[i+1]);
            double max = Math.max(longs[i],longs[i+1]);
            areas[i] = max - ((max - min) / 2);
        }
        //구간 면적 합 계산
        for (int i = 0; i < ranges.length; i++) {
            if(areas.length < (ranges[i][0] - ranges[i][1]))
                answer[i] = -1;
            else {
                for (int j = ranges[i][0]; j < areas.length+ranges[i][1]; j++) {
                    answer[i]+=areas[j];
                }
            }
        }

        return answer;
    }
}
