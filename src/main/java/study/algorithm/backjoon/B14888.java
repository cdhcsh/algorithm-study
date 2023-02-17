package study.algorithm.backjoon;

/**
 * 연산자 끼워넣기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B14888 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] operatorCnts = new int[4];// +,-,x,/
    static int[] nums;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        N = n-1;
        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operatorCnts[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,nums[0]);
        bw.write(max+"\n");
        bw.write(min+"");
        bw.close();
    }
    static void dfs(int n,int result){
        if(n == N) {
            max = Math.max(result,max);
            min = Math.min(result,min);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if(operatorCnts[i] > 0){
                operatorCnts[i]--;
                int tmp = result;
                switch (i){
                    case 0 : tmp += nums[n+1]; break;
                    case 1 : tmp -= nums[n+1]; break;
                    case 2 : tmp *= nums[n+1]; break;
                    default: tmp /= nums[n+1];
                }
                dfs(n+1,tmp);
                operatorCnts[i]++;
            }
        }
    }

}
