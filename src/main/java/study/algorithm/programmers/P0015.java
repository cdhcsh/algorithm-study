package study.algorithm.programmers;

import java.util.Arrays;

public class P0015 {
    public static int solution(int[][] sizes) {
        int maxN= 0;
        int maxM = 0;
        for(int i = 0; i < sizes.length ; i++){
            Arrays.sort(sizes[i]);
            maxN = sizes[i][0] > maxN ? sizes[i][0] : maxN;
            maxM = sizes[i][1]> maxM? sizes[i][1]: maxM;
        }
        return maxN * maxM;
    }
}
