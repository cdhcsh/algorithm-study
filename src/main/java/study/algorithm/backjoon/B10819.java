package study.algorithm.backjoon;

/**
 * 차이를 최대로
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10819 {
    static int[] temp;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        N = length;
        temp = new int[length];
        visit = new boolean[length];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(dfs(0,arr)+"\n");
        bw.close();
    }
    static int dfs(int n,int[] arr){
        if(n == N){
            System.out.println(Arrays.toString(temp));
            return diff();
        }
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if(!visit[i]){
                visit[i] = true;
                temp[n] = arr[i];
                max = Math.max(dfs(n+1,arr),max);
                visit[i] = false;
            }
        }
        return max;
    }
    static int diff(){
        int result = 0 ;
        for (int i = 0; i < temp.length-1; i++) {
            result += Math.abs(temp[i]-temp[i+1]);
        }
        return result;
    }
}
