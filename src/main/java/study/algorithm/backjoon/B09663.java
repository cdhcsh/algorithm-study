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
        for (int y = 0; y < n; y++) {
            if(check(x,y,visit)){
                visit[x] = y;
                cnt += dfs(x+1,n,visit);
            }
        }
        return cnt;

    }
    static boolean check(int x1, int y1, int[] visit){
        for (int x2 = 0; x2 < x1; x2++) {
            int y2 = visit[x2];
            if(y2 == y1) return false;
            if(x1-x2 == Math.abs(y1 - y2)) return false;
        }
        return true;
    }

}
