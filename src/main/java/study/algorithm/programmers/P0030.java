package study.algorithm.programmers;

/**
 * 체육복
 */

public class P0030 {
    public static void start() {
        P0030 obj = new P0030();
        int result = obj.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
        System.out.println(result);
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        for (int i : lost) students[i - 1]--;
        for (int i : reserve) students[i - 1]++;
        for (int i = 0; i < n; i++) {
            if (students[i] > 0) {
                if (i > 0 && students[i - 1] < 0) {
                    students[i]--;
                    students[i - 1]++;
                } else if (i < n - 1 && students[i + 1] < 0) {
                    students[i]--;
                    students[i + 1]++;
                }
            }
        }
        for (int i : students) if (i >= 0) answer++;
        return answer;
    }
}
