package study.algorithm.backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B02503 {
    static int[] answers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        answers = new int[1000];
        Arrays.fill(answers, 0);
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] question = toArray(Integer.parseInt(st.nextToken()));
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            System.out.println(i);

            int[] answer = new int[3];
            solveToDfs(0, answer, question, strike, ball);
        }
        System.out.println(Arrays.stream(answers).filter(i -> i == 1).count());
    }

    static void solveToFor(int[] question, int strike, int ball) {
        int[] answer = new int[3];
        for (int a = 1; a <= 9; a++) {
            answer[0] = a;
            for (int b = 1; b <= 9; b++) {
                if (a == b) continue;
                answer[1] = b;
                for (int c = 1; c <= 9; c++) {
                    if (b == c || a == c) continue;
                    answer[2] = c;

                    validation(answer, question, strike, ball);

                }
            }
        }
    }

    static void solveToDfs(int n, int[] answer, int[] question, int strike, int ball) {
        if (n == 3) {
            validation(answer, question, strike, ball);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            boolean b = true;
            for (int j = 0; j < n; j++) {
                if (answer[j] == i) b = false;
            }
            if (b) {
                answer[n] = i;
                solveToDfs(n + 1, answer, question, strike, ball);
            }
        }
    }

    static void validation(int[] answer, int[] question, int strike, int ball) {
        int idx = toNumber(answer);
        if (answers[idx] >= 0 &&
                check(answer, question, strike, ball)) {
            answers[idx] = 1;
        } else {
            answers[idx] = -1;
        }
    }

    static boolean check(int[] answer, int[] question, int strike, int ball) {
        for (int i = 0; i < 3; i++) {
            if (answer[i] == question[i]) {
                strike--;
            } else if (answer[i] == question[(i + 1) % 3]
                    || answer[i] == question[(i + 2) % 3]) {
                ball--;
            }
        }
        return strike == 0 && ball == 0;
    }

    static int[] toArray(int num) {
        int[] arr = new int[3];
        arr[2] = num % 10;
        arr[1] = num / 10 % 10;
        arr[0] = num / 100 % 10;
        return arr;
    }

    static int toNumber(int[] nums) {
        return nums[0] * 100 + nums[1] * 10 + nums[2];
    }
}
