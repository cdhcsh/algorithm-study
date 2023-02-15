package study.algorithm.backjoon;

/**
 * 체스판 다시 칠하기
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] board = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                if(s.charAt(j)=='B'){
                    board[i][j] = true;
                }
                else{
                    board[i][j] = false;
                }
            }
        }
        int min = n*m;
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                int result = check(board,i,j);
                min = Math.min(min,result);
            }
        }
        bw.write(min+"");
        bw.close();
    }
    static int check(boolean[][] board,int x, int y){
        boolean bool = board[x][y];
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i+x][j+y]!=bool) cnt++;
                bool=!bool;
            }
            bool = !bool;
        }
        return Math.min(cnt,64-cnt);
    }
}
