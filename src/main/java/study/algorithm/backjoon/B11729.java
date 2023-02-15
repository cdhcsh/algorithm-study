package study.algorithm.backjoon;

import java.io.*;

public class B11729 {
    static int[][] answer;
    static int idx = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = (int) (Math.pow(2,n)-1);
        answer = new int[cnt][2];
        hanoi(n,1,2,3);
        bw.write(cnt +"\n");
        for (int[] ints : answer) {
            bw.write(ints[0] + " " + ints[1] + "\n");
        }
        bw.close();

    }
    static void hanoi(int n,int start,int between,int end){
        if(n==1){
            move(start,end);
            return;
        }
        hanoi(n-1,start,end,between);
        move(start,end);
        hanoi(n-1,between,start,end);
    }
    static void move(int from,int to){
        answer[idx][0] = from;
        answer[idx++][1] = to;
    }
}
