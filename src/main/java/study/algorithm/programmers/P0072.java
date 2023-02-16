package study.algorithm.programmers;

/**
 * N-Queen
 */

public class P0072 {
    public static void main(String[] args) {
        System.out.println(new P0072().solution(5));
    }
    public int solution(int n) {
        int[] visit = new int[n];
        return dfs(0,n,visit);
    }
    public int dfs(int x,int n,int[] visit){
        int cnt = 0;
        if(x == n) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            if(check(x,i,n,visit)){
                visit[x] = i;
                cnt += dfs(x+1,n,visit);
            }
        }
        return cnt;
    }
    public boolean check(int x,int y,int n,int[] visit){
        for (int i = 0; i < x; i++) {
            if(visit[i] == y) return false;
            if(Math.abs(visit[i]-y)==(x-i)) return false;
        }
        return true;
    }


}
