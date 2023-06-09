package study.algorithm.backjoon;

/*
 균형잡힌 세상
 */

import java.io.*;
import java.util.Stack;

public class B04949 {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char temp;

        while (true) {
            stack.clear();
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                temp = s.charAt(i);
                if (temp == '(' || temp == '[') {
                    stack.push(temp);
                } else if (temp == ')' || temp == ']') {
                    if (stack.isEmpty() || (stack.peek() == '(' && temp == ']') || (stack.peek() == '[' && temp == ')')) {
                        stack.push(temp);
                        break;
                    }
                    stack.pop();

                }
            }

            if (!stack.isEmpty())
                bw.write("no\n");
            else
                bw.write("yes\n");

        }
        bw.close();
    }
}
