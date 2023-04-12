package study.algorithm.backjoon;

/**
 * 제로
 */

import java.io.*;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if(m!=0) stack.add(m);
            else stack.pop();
        }
        System.out.println(stack.stream().mapToInt(i->i).sum());


    }
}
