package study.algorithm.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 후위 표기식
 */

public class B01935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        char[] chars = br.readLine().toCharArray();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Double> stack = new Stack<>();
        for (char c : chars) {
            if(c >= 'A' && c <= 'Z') stack.push(arr[c-'A']+0.0);
            else{
                double a = stack.pop();
                double b = stack.pop();
                double r = 0.0;
                switch (c){
                    case '+' :
                        r = b + a;
                        break;
                    case '-' :
                        r = b - a;
                        break;
                    case '*' :
                        r = b * a;
                        break;
                    default:
                        r = b / a;
                }
                stack.push(r);
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}
