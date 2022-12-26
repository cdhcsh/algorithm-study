package study.algorithm.programmers;

import java.util.Arrays;

public class P0034 {
    public static void start() {
        P0034 obj = new P0034();
        int result = obj.solution(new String("1S2D*3T"));
        System.out.println(result);
    }
    public int solution(String dartResult) {
        int[] scores = new int[3];
        StringBuilder numStr = new StringBuilder();
        int i = -1;
        for (char c : dartResult.toCharArray()) {
            if (c >= '0' && c <= '9') numStr.append(c);
            else if (c == 'S' || c == 'D' || c == 'T') {
                scores[++i] = Integer.parseInt(numStr.toString());
                numStr = new StringBuilder();
                if (c == 'D') scores[i] = (int) Math.pow(scores[i], 2);
                if (c == 'T') scores[i] = (int) Math.pow(scores[i], 3);
            } else if (c == '*') {
                if (i > 0) scores[i - 1] *= 2;
                scores[i] *= 2;
            } else if (c == '#') {
                scores[i] *= -1;
            }
        }
        return Arrays.stream(scores).sum();
    }

}
