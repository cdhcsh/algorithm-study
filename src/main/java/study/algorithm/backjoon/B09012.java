package study.algorithm.backjoon;

/**
 * 괄호
 */

import java.io.*;
import java.util.Stack;

public class B09012 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            stack.clear();
            boolean answer = true;
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') stack.add(1);
                else if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else stack.pop();
            }
            if (answer && stack.isEmpty()) bw.write("YES\n");
            else bw.write("NO\n");
        }
        bw.close();
    }
}
