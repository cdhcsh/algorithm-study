package study.algorithm.backjoon;

/**
 * 스도쿠
 */

import java.io.*;
import java.util.StringTokenizer;

public class B02580 {
    static int M = 0;
    static int[][] board;
    static int test = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        board = new int[9][9];
        int[] targets = new int[81];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 0) targets[M++] = (i * 9 + j);

            }
        }
        dfs(0, targets);
    }

    static void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bw.write(board[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }

    static void dfs(int n, int[] targets) throws IOException {
        if (n == M) {
            print();
            System.exit(0);
        }
        int c = targets[n];
        int x = c / 9;
        int y = c % 9;
        for (int i = 1; i <= 9; i++) {
            if (lineCheck(x, y, i) && squareCheck(x, y, i)) {
                board[x][y] = i;
                dfs(n + 1, targets);
                board[x][y] = 0;
            }
        }
    }

    static boolean lineCheck(int x, int y, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[x][i] == num) return false;
            if (board[i][y] == num) return false;
        }
        return true;
    }

    static boolean squareCheck(int x, int y, int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[(x / 3) * 3 + i][(y / 3) * 3 + j] == num) return false;
            }
        }
        return true;
    }

}
