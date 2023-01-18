package study.algorithm.programmers;

public class P0073 {
        int[][] answer;
        int[] d;
        int c = 0;
    public int[][] solution(int n) {
        d = new int[n];
        answer = new int[hanoiCount(n)][2];
        hanoi(n,1,2,3);
        return answer;
    }
    public int hanoiCount(int n){
        if(n == 1) return 1;
        else if(d[n-1] > 0) return d[n-1];
        else {
        d[n-1] = hanoiCount(n - 1) * 2 + 1;
        return d[n-1];
        }
    }
    public void hanoi(int n,int start,int between,int end){
        if(n==1){
            move(start,end);
            return;
        }
        hanoi(n-1,start,end,between);
        move(start,end);
        hanoi(n-1,between,start,end);
    }
    public void move(int start,int end){
        answer[c][0] = start;
        answer[c][1] = end;
        c++;
    }
}
