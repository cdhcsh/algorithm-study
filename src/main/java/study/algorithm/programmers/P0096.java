package study.algorithm.programmers;

/**
 * 폰켓몬
 */

import java.util.HashSet;
import java.util.Set;

public class P0096 {
    public static void main(String[] args) {
        P0096 obj = new P0096();
        int[][] nums = {
                {3, 1, 2, 3},
                {3, 3, 3, 2, 2, 4},
                {3, 3, 3, 2, 2, 2}
        };
        for (int[] num : nums) {
            System.out.println(obj.solution(num));
        }
    }

    public int solution(int[] nums) {
        int n = nums.length / 2;
        Set<Integer> poketmons = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            poketmons.add(nums[i]);
        }
        return Math.min(poketmons.size(), n);
    }
}
