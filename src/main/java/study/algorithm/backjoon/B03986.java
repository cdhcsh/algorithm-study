package study.algorithm.backjoon;

/**
 * 좋은 단어
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B03986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            stack.clear();
            for (int j = 0; j < str.length(); j++) {
                char c= str.charAt(j);
                if(stack.isEmpty() || stack.peek()!=c)
                    stack.add(c);
                else stack.pop();
            }
            if(stack.isEmpty()) answer++;
        }
        System.out.println(answer);




    }
}
