package study.algorithm.backjoon;

/**
 * 행렬
 */

import java.io.*;
import java.util.StringTokenizer;

public class B01080 {
    static int N;
    static int M;
    static boolean start[][];
    static boolean object[][];
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        start = input();
        object = input();
        System.out.println(solve());


    }
    static int solve(){
        int answer = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = 0; j < M-2; j++) {
                if(start[i][j] == object[i][j])
                    continue;
                answer++;
                reverse(i,j);
            }
        }
        if(check())return answer;
        else return -1;
    }
    static boolean check(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(start[i][j] != object[i][j])
                    return false;
            }
        }
        return true;
    }

    static boolean[][] input() throws IOException {
        boolean[][] arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = (chars[j] == '1');
            }
        }
        return arr;
    }

    static void reverse(int x, int y) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                start[x + i][y + j] = !start[x + i][y + j];
            }
        }
    }
}
