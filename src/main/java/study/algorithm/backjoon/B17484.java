package study.algorithm.backjoon;

/**
 * 진우의 달 여행(Small)
 */

import java.io.*;
import java.util.StringTokenizer;

public class B17484 {
    static int N;
    static int M;
    static int[]D = {-1,0,1};
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int min = 601;
        for (int i = 0; i < M; i++) {
            min = Math.min(min,dfs(0,i,-1,0));
        }
        System.out.println(min);
    }
    public static int dfs(int h,int w,int d,int value){
        value += arr[h][w];
        if(h == N-1){
            return value;
        }
        int min = 601;
        for (int i = 0; i < 3; i++) {
            if(d == i) continue;
            int p = w + D[i];
            if(p >= 0 && p < M)
                min = Math.min(min,dfs(h+1,p,i,value));
        }
        return min;
    }
}
