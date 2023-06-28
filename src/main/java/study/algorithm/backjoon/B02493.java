package study.algorithm.backjoon;

/**
 * 탑
 */

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class B02493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());
            int target = 0;
            while(!stack.isEmpty()){
                int[] temp = stack.peek();
                if(temp[1] > height){
                    target = temp[0];
                    break;
                }
                else stack.pop();
            }
            bw.write(target+" ");
            stack.add(new int[]{i+1,height});
        }
        bw.close();
    }
}
