package study.algorithm.backjoon;

/**
 * N-Queen
 */

import java.io.*;

public class B09663 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(dfs(0,n, new int[n])+"");
        bw.close();
    }
    static int dfs(int x,int n,int[] visit){
        if(x==n) return 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(check(x,i,visit)){
                visit[x] = i;
                cnt += dfs(x+1,n,visit);
            }
        }
        return cnt;

    }
    static boolean check(int x, int y, int[] visit){
        for (int i = 0; i < x; i++) {
            if(visit[i] == y) return false;
            if(x-i == Math.abs(y - visit[i])) return false;
        }
        return true;
    }

}
