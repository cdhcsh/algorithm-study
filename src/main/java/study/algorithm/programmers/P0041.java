package study.algorithm.programmers;

import java.util.Stack;

class P0041 {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(') stack.push(c);
            else if(c==')'){
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}