package study.algorithm.backjoon;

/**
 * 스택 수열
 */

import java.io.*;
import java.util.Stack;

public class B01874 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int c = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            while (number > c) {
                stack.add(++c);
                sb.append("+\n");
            }
            if (stack.peek() == number) {
                stack.pop();
                sb.append("-\n");
            } else if (c > number) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
